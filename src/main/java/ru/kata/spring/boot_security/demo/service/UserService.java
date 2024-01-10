package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {

    User findByEmail(String email);

    List<User> getAllUsers();

    User findUserById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    boolean isUserExists(String username);
}
