package com.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String emailTo;

    public void send(String content, String email, String subject) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setText(content);
        message.setSubject(subject);
        message.setFrom(email);
        message.setTo(emailTo);

        mailSender.send(message);
    }
}
