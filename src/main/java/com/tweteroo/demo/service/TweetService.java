package com.tweteroo.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.demo.dto.TweetDTO;
import com.tweteroo.demo.model.Tweet;
import com.tweteroo.demo.repository.TweetRepository;

@Service

public class TweetService {
    @Autowired
    private TweetRepository repository;

    public Tweet create(TweetDTO dto) {
        return repository.save(new Tweet(dto));
    }

    public List<Tweet> get() {
        return repository.findTop5ByOrderByIdDesc();
    }

    public List<Tweet> getFromUser(String userName) {
        return repository.findByUserName(userName);
    }

}
