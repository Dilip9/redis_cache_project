package com.gouri.rediscache.dto.request;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record UserRequest(Long id,
                          @NotNull String username,
                          @Email @Column(unique = true) String email) {
}
