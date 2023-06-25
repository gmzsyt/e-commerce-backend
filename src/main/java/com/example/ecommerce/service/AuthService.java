package com.example.ecommerce.service;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public void logoutUser() {
        SecurityContextHolder.clearContext();
    }
}
