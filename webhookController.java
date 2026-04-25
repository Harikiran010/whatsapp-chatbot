package com.hari.whatsappbot;

import org.springframework.web.bind.annotation.*;

@RestController
public class webhookController {

    @PostMapping("/webhook")
    public String handleMessage(@RequestBody MessageRequest request) {

        String msg = request.getMessage();
        System.out.println("Received: " + msg);

        if(msg.equalsIgnoreCase("Hi")) {
            return "Hello";
        } else if(msg.equalsIgnoreCase("Bye")) {
            return "Goodbye";
        } else {
            return "I didn't understand";
        }
    }
}