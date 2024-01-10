package ru.kata.spring.boot_security.demo;

import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class InitialDataLoader {

    private UserService userService;
    private RoleService roleService;

    public InitialDataLoader(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    private void fillDataBase() {

        Role adminRole = new Role("ROLE_ADMIN");
        Role userRole = new Role("ROLE_USER");
        roleService.saveRole(adminRole);
        roleService.saveRole(userRole);

        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminRoles.add(userRole);

        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);

        Byte age11 = 11;
        Byte age12 = 12;
        Byte age13 = 13;
        Byte age14 = 14;
        Byte age15 = 15;
        Byte age20 = 20;

        User user1 = new User("User1", "User1LastNane", "user1", age11, "user.1@mail.mail", userRoles);
        User user2 = new User("User2", "User2LastNane", "user2", age12, "user.2@mail.mail", userRoles);
        User user3 = new User("User3", "User3LastNane", "user3", age13 ,"user.3@mail.mail", userRoles);
        User user4 = new User("User4", "User4LastNane", "user4", age14 ,"user.4@mail.mail", userRoles);
        User user5 = new User("User5", "User5LastNane", "user5", age15 ,"user.5@mail.mail", userRoles);

        User admin = new User("Admin", "AdminLastNane", "admin", age20 ,"admin@mail.mail", adminRoles);

        user1.setRoles(userRoles);
        user2.setRoles(userRoles);
        user3.setRoles(userRoles);
        user4.setRoles(userRoles);
        user5.setRoles(userRoles);

        admin.setRoles(adminRoles);

        userService.addUser(admin);
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);
        userService.addUser(user4);
        userService.addUser(user5);
    }
}
