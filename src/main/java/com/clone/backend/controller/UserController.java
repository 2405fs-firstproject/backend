package com.clone.backend.controller;
import com.clone.backend.model.User;
import com.clone.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/member")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/post")
    public String post(@RequestBody User user) {
        userService.saveUser(user);
        return "New member is added";



    }
    }
