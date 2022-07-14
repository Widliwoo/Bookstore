package com.example.bookstore.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResultDto {
    private boolean successful;
    private String errorCode;
    private String errorMessage;

    public static RegisterResultDto success() {
        return new RegisterResultDto(true, null, null);
    }

    public static RegisterResultDto failure(String errorCode) {
        return new RegisterResultDto(false, errorCode, null);
    }
}
