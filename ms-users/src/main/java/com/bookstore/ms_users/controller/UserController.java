package com.bookstore.ms_users.controller;

import com.bookstore.ms_users.service.KeycloakService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private KeycloakService keycloakService;

    @PostMapping
    public void createUser(@RequestParam String username, @RequestParam String password) {
        keycloakService.createUser(username, password);
    }
}
