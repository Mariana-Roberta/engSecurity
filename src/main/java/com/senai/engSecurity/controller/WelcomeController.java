package com.senai.engSecurity.controller;

import com.senai.engSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String welcome() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String user() {
        return "Authorize USER";
    }

    @GetMapping("/adm")
    public String adm() {
        return "Authorize ADM";
    }

}
