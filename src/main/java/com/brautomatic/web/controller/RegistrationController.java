package com.brautomatic.web.controller;

import com.brautomatic.model.Role;
import com.brautomatic.model.User;
import com.brautomatic.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/")
    public String registration() {
        return "registration";
    }

    @PostMapping("/")
    public String addUser(User user, Map<String, Object> model) {
        User currentUser = (User) userService.loadUserByUsername(user.getUsername());

        if(currentUser != null) {
            model.put("message", "User was register! Try again!");
            return "registration";
        }
        userService.addUser(user);

        return "redirect:/auth";
    }
}
