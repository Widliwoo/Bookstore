package com.example.bookstore.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserDto {

    @NotBlank
    @Size(min = 5, max = 25)
    private String username;

    @NotBlank
    @Size(min = 6, max = 25)
    private String password;

    @NotBlank
    @Size(min = 6, max = 25)
    private String passwordAgain;

    @Email
    private String email;
}
