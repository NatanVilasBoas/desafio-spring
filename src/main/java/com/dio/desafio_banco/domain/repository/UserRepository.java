package com.dio.desafio_banco.domain.repository;

import com.dio.desafio_banco.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccount_Number(String accountNumber);
}
