package com.example.pp_3_1_2.service;

import com.example.pp_3_1_2.model.User;

import java.util.List;

public interface UserService {
    void createUser(User user);
    List<User> listUsers();
    void editEmail(Long id, String NewEmail);
    void dropUser(Long id);
    User getUserById(Long id);
}
