package com.tweteroo.demo.dto;

import jakarta.validation.constraints.NotBlank;

public record UsersDTO(
                @NotBlank String userName,
                @NotBlank String avatar) {
}
