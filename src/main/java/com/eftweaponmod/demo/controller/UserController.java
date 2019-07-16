package com.eftweaponmod.demo.controller;

import com.eftweaponmod.demo.data.UserRepo;
import com.eftweaponmod.demo.data.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/signup")
    public String showSignUpForm(Users user) {
        return "add-user";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid Users users, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        userRepo.save(users);
        model.addAttribute("users", userRepo.findAll());
        return "index";
    }

}
