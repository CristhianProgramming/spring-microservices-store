package com.cristhianPCmicroservices.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {
    @GetMapping("/status")
    String health(){
        return "up";
    }
}
