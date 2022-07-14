package com.example.bookstore.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotNull;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where upper(u.username) = upper(?1) or upper(u.email) = upper(?2)")
    Optional<User> findUserByUsernameOrEmailIgnoreCase(@NonNull String username, @NotNull String email);
}
