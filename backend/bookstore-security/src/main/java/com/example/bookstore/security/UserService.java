package com.example.bookstore.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public RegisterResultDto registerUser(RegisterUserDto dto) {
        Optional<User> user = userRepository.findUserByUsernameOrEmailIgnoreCase(dto.getUsername(), dto.getEmail());
        if (user.isPresent()) {
            if (user.get().getUsername().equalsIgnoreCase(dto.getUsername())) {
                return RegisterResultDto.failure(MessageCodes.REGISTER_USERNAME_DUPLICATE);
            }
            if (user.get().getEmail().equalsIgnoreCase(dto.getEmail())) {
                return RegisterResultDto.failure(MessageCodes.REGISTER_EMAIL_DUPLICATE);
            }
        }
        User newUser = mapUserDto(dto);
        userRepository.save(newUser);
        //todo: генерировать событие для создания и отправки кода для подтверждения email
        return RegisterResultDto.success();
    }

    private User mapUserDto(RegisterUserDto dto) {
        User user = new User();
        user.setUsername(dto.getUsername());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setEmail(dto.getEmail());
        user.setEnabled(true);
        Role role = new Role();
        role.setRoleName(BookstoreRoles.CUSTOMER);
        role.setUsername(dto.getUsername());
        user.setRoles(Set.of(role));
        return user;
    }
}
