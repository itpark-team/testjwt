package com.example.testjwt.controllers;

import com.example.testjwt.dto.AuthOrRegisterResponseDto;
import com.example.testjwt.dto.AuthRequestDto;
import com.example.testjwt.dto.RegisterRequestDto;
import com.example.testjwt.services.AuthOrRegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthOrRegisterService authOrRegisterService;

    @PostMapping("/register")
    public ResponseEntity<AuthOrRegisterResponseDto> register(
            @RequestBody RegisterRequestDto registerRequestDto
    ) {
        return ResponseEntity.ok(authOrRegisterService.register(registerRequestDto));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthOrRegisterResponseDto> authenticate(
            @RequestBody AuthRequestDto authRequestDto
    ) {
        return ResponseEntity.ok(authOrRegisterService.authenticate(authRequestDto));
    }
}
