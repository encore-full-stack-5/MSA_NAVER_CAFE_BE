package com.example.cafe.global.domain.dto;

import jakarta.persistence.Column;

public record CafeDto(
        Long id,
        String name,
        String icon,
        Boolean visibility,
        Boolean useNameOption,
        String description,
        Long managerId,
        String createdAt, //테스트 하기 편하도록 String으로 임의로 바꿔 놓음 -> 추후 DATE로 변환 필요
        Boolean joinQuestionYn,
        String joinQuestion,
        String address

        ) {
}
