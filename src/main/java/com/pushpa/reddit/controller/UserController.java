package com.pushpa.reddit.controller;

import com.pushpa.reddit.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {
    public UserController(com.pushpa.reddit.repository.User user) {
        this.user = user;
    }

    com.pushpa.reddit.repository.User user;

    @GetMapping("/api/user")
    public List<User> getUser() {
        List<User> users = new ArrayList<>();
        user.save(new User(1L, "Pushpa", "dcpushparaj@gmail.com", "abcd", Instant.now()));
        return users;
    }
}
