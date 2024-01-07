package com.tweteroo.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.demo.model.Tweet;

@Repository

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    List<Tweet> findTop5ByOrderByIdDesc();

    List<Tweet> findByUserName(String userName);
}
