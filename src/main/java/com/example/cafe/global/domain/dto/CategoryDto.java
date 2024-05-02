package com.example.cafe.global.domain.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public record CategoryDto(
        Long id,
        String mainCategory,
        String subCategory
        ) {
}
