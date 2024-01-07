package com.tweteroo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweteroo.demo.model.Users;

@Repository

public interface UsersRepository extends JpaRepository<Users, Long> {

}
