package com.dominiomondi.EntradaDados.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominiomondi.EntradaDados.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

