package com.email.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @RequestMapping("sendEmail")
    public void sendEmail() {

    }
}
