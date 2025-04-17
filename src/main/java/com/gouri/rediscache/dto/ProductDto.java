package com.gouri.rediscache.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public record ProductDto(Long id, @NotBlank String name, @Positive BigDecimal price, String description, String imageUrl, LocalDateTime createdAt, LocalDateTime updatedAt) {
    public ProductDto(Long id, String name, BigDecimal price) {
        this(id, name, price, null, null, null, null);
    }
}
