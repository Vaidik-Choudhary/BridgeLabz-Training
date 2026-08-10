package com.vaidik.demogreetingsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vaidik.demogreetingsapp.model.User;
import com.vaidik.demogreetingsapp.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {

        userService.registerUser(user);

        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {

        User user = userService.loginUser(email, password);

        if (user != null) {

            session.setAttribute("userId", user.getId());
            session.setAttribute("userName", user.getName());

            return "redirect:/welcome";
        }

        model.addAttribute("error", "Invalid Email or Password");
        return "login";
    }

    @GetMapping("/welcome")
    public String welcomePage(HttpSession session, Model model) {

        Long userId = (Long) session.getAttribute("userId");

        if (userId == null) {
            return "redirect:/login";
        }

        String userName = (String) session.getAttribute("userName");
        model.addAttribute("name", userName);

        return "welcome";
    }
    
    @GetMapping("/update-password")
    public String updatePasswordPage(HttpSession session) {

        Long userId = (Long) session.getAttribute("userId");

        if (userId == null) {
            return "redirect:/login";
        }

        return "update-password";
    }
    
    @PostMapping("/update-password")
    public String updatePassword(@RequestParam String currentPassword, @RequestParam String newPassword, @RequestParam String confirmPassword, HttpSession session, Model model) {

        Long userId = (Long) session.getAttribute("userId");

        if (userId == null) {
            return "redirect:/login";
        }

        if (!newPassword.equals(confirmPassword)) {
            model.addAttribute("error", "New passwords do not match");
            return "update-password";
        }

        boolean updated = userService.updatePassword(userId,currentPassword,newPassword);

        if (!updated) {
            model.addAttribute("error", "Current password is incorrect");
            return "update-password";
        }

        model.addAttribute("success", "Password updated successfully");

        return "update-password";
    }
    
    @PostMapping("/delete-account")
    public String deleteAccount(HttpSession session) {

        Long userId = (Long) session.getAttribute("userId");

        if (userId == null) {
            return "redirect:/login";
        }

        userService.deleteUser(userId);

        session.invalidate();

        return "redirect:/";
    }
}