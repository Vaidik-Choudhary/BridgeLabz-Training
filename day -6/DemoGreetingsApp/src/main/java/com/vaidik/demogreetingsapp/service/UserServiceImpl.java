package com.vaidik.demogreetingsapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaidik.demogreetingsapp.model.User;
import com.vaidik.demogreetingsapp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User registerUser(User user) {

        if (userRepository.existsByEmail(user.getEmail())) {
            return null;
        }

        return userRepository.save(user);
    }

    @Override
    public User loginUser(String email, String password) {

        Optional<User> optionalUser = userRepository.findByEmail(email);

        if (optionalUser.isPresent()) {

            User user = optionalUser.get();

            if (user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;
    }
    
    @Override
    public boolean updatePassword(Long userId, String currentPassword, String newPassword) {

        Optional<User> optionalUser = userRepository.findById(userId);

        if (optionalUser.isEmpty()) {
            return false;
        }

        User user = optionalUser.get();

        if (!user.getPassword().equals(currentPassword)) {
            return false;
        }

        user.setPassword(newPassword);
        userRepository.save(user);

        return true;
    }

    @Override
    public boolean deleteUser(Long userId) {

        if (!userRepository.existsById(userId)) {
            return false;
        }

        userRepository.deleteById(userId);

        return true;
    }

}