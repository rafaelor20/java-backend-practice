package com.tweteroo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.demo.dto.UsersDTO;
import com.tweteroo.demo.service.UsersService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping()
public class UsersController {
    @Autowired
    private UsersService service;

    @PostMapping("/sign-up")
    public void create(@RequestBody @Valid UsersDTO req) {
        service.create(req);
    }

}
