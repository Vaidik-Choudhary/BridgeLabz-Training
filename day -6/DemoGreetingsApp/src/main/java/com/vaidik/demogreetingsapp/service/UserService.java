package com.vaidik.demogreetingsapp.service;

import com.vaidik.demogreetingsapp.model.User;

public interface UserService {

    User registerUser(User user);

    User loginUser(String email, String password);

    boolean updatePassword(Long userId, String currentPassword, String newPassword);

    boolean deleteUser(Long userId);
}