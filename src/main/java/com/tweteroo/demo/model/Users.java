package com.tweteroo.demo.model;

import com.tweteroo.demo.dto.UsersDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Users {
    public Users(UsersDTO data) {
        this.userName = data.userName();
        this.avatar = data.avatar();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 50, nullable = false)
    private String userName;

    @Column(length = 100, nullable = false)
    private String avatar;
}
