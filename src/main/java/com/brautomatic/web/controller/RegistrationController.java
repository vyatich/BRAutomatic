package com.brautomatic.web.controller;

import com.brautomatic.model.Role;
import com.brautomatic.model.User;
import com.brautomatic.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.net.BindException;
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
    public String addUser(
            User user, //todo will add validation
            Model model) {

        User currentUser = (User) userService.loadUserByUsername(user.getUsername());

        if(currentUser != null) {
            model.addAttribute("message", "User with this username was register! Try another username!");
            return "registration";
        }
        userService.addUser(user);

        return "redirect:/auth";
    }
}
