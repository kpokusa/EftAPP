package com.eftweaponmod.demo.controller;

import com.eftweaponmod.demo.data.WeaponAttachRepo;
import com.eftweaponmod.demo.data.WeaponAttachments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class WeaponAttachmentController {


    @Autowired
    private WeaponAttachRepo weaponAttachRepo;


    @GetMapping("/addweaponmod")
    public String showAddAttachmentForm(WeaponAttachments weaponAttachments) {
        return "addAttachment";
    }

    @PostMapping("/addAttach")
    public String addAttachment(@Valid WeaponAttachments weaponAttachments, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "addAttachment";
        }

        weaponAttachRepo.save(weaponAttachments);
        model.addAttribute("weaponAttachments", weaponAttachRepo.findAll());
        return "index";
    }
}
