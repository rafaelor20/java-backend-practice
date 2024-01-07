package com.tweteroo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.demo.dto.UsersDTO;
import com.tweteroo.demo.model.Users;
import com.tweteroo.demo.repository.UsersRepository;

@Service

public class UsersService {
    @Autowired
    private UsersRepository repository;

    public Users create(UsersDTO dto) {
        return repository.save(new Users(dto));
    }
}
