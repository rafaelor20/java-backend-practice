package com.tweteroo.demo.dto;

import jakarta.validation.constraints.NotBlank;

public record TweetDTO(
        @NotBlank String userName,
        @NotBlank String text) {

}
