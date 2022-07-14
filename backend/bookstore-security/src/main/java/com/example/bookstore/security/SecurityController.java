package com.example.bookstore.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public void login() {

    }

    @PostMapping("/logout")
    public void logout() {

    }

    @PostMapping("/register")
    public RegisterResultDto register(@Valid @RequestBody RegisterUserDto dto) {
        return userService.registerUser(dto);
    }

    @GetMapping("/email")
    public void approveEmail(@RequestParam String approveCode) {
    }

    @GetMapping(value = "/test", produces = MediaType.TEXT_HTML_VALUE)
    public String test() {
        return "<h1>TEST</h1>";
    }

}
