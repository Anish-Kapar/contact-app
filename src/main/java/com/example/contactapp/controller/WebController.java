package com.example.contactapp.controller;

import com.example.contactapp.model.Contact;
import com.example.contactapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {

    @Autowired
    private ContactService service;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("contacts", service.getAll());
        model.addAttribute("contact", new Contact());
        return "index";
    }

    @PostMapping("/add")
    public String add(Contact contact) {
        service.add(contact);
        return "redirect:/";
    }

    @GetMapping("/remove")
    public String remove() {
        service.remove();
        return "redirect:/";
    }
}