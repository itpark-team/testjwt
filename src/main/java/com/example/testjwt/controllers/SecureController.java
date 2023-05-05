package com.example.testjwt.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/secure")
public class SecureController {

    @GetMapping("/getHello")
//    @PreAuthorize("isAuthenticated()")
    public String getHello() {
        return "hello secure";
    }
}
