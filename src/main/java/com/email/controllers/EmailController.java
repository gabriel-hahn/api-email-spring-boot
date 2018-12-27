package com.email.controllers;

import com.email.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
    public void sendEmail(@RequestParam("content") String content, @RequestParam("email") String email, @RequestParam("subject") String subject) {
        emailService.send(content, email, subject);
    }
}
