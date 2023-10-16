package com.picpaysimplify.repositories;

import com.picpaysimplify.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User>findUserByDocument(String document); //Estou definindo um método que vai buscar os usuários pelo documento
    Optional<User>findUserById(Long id);
}
