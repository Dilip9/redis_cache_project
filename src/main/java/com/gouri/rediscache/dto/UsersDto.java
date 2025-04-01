package com.gouri.rediscache.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record UsersDto(Long id,
                       @NotNull String username,
                       @Email @Column(unique = true) String email) {
}
