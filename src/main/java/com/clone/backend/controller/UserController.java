package com.clone.backend.controller;
import com.clone.backend.model.User;
import com.clone.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public String post(@RequestBody User user) {
        userService.saveUser(user);
        return "New member is added";

        }
    @GetMapping ("/getAll")
    public List<User> getAllUser(){
        return userService.getAllUser();

    }
    }
