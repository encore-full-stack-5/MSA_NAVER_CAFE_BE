package com.example.cafe.dto.request;

import com.example.cafe.global.domain.entity.Cafe;

import java.time.LocalDateTime;

public record CreateCafeRequest (
        String name,
        String icon,
        Boolean visibility,
        Boolean useNameOption,
        String description,
        Long managerId,
        String createdAt,
        Boolean joinQuestionYn,
        String joinQuestion,
        String address

){
    public Cafe toEntity(){
        return new Cafe(
                null,
                name,
                icon,
                visibility,
                useNameOption,
                description,
                managerId,
                joinQuestionYn,
                joinQuestion,
                address,
                "새싹",
                false,
                LocalDateTime.now()
        );
    }
}
