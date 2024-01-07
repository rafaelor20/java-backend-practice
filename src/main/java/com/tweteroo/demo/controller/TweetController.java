package com.tweteroo.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.demo.dto.TweetDTO;
import com.tweteroo.demo.model.Tweet;
import com.tweteroo.demo.service.TweetService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping

public class TweetController {
    @Autowired
    private TweetService service;

    @PostMapping("/tweets")
    public void create(@RequestBody @Valid TweetDTO req) {
        service.create(req);
    }

    @GetMapping("/tweets")
    public List<Tweet> getLast5() {
        return service.get();
    }

    @GetMapping("/tweets/{userName}")
    public List<Tweet> getFromUser(@PathVariable String userName) {
        return service.getFromUser(userName);
    }

}
