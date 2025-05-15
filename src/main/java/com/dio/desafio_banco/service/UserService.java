package com.dio.desafio_banco.service;

import com.dio.desafio_banco.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);
}
