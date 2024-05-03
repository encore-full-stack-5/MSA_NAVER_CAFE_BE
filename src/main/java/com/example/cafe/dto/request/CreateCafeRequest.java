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
        String createdAt, //테스트 하기 편하도록 String으로 임의로 바꿔 놓음 -> 추후 DATE로 변환 필요
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
                LocalDateTime.now()
        );
    }
}
