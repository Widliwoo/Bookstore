package com.example.bookstore.security;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @PostMapping("/login")
    public void login() {

    }

    @PostMapping("/logout")
    public void logout() {

    }

    @PostMapping("/register")
    public void register() {

    }

    @GetMapping("/email")
    public void approveEmail(@RequestParam String approveCode) {
    }

}
