package com.dio.desafio_banco.service.impl;

import com.dio.desafio_banco.domain.model.User;
import com.dio.desafio_banco.domain.repository.UserRepository;
import com.dio.desafio_banco.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if(user.getId() != null && userRepository.existsByAccountNumber(user.getAccount().getNumber())) throw  new IllegalArgumentException("This user ID already exists");
        return userRepository.save(user);
    }
}
