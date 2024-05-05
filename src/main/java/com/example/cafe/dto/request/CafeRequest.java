package com.example.cafe.dto.request;

import com.example.cafe.global.domain.entity.Cafe;

import java.time.LocalDateTime;

public record CafeRequest(
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
        return Cafe.builder()
                .id(null)
                .name(name)
                .icon(icon)
                .visibility(visibility)
                .useNameOption(useNameOption)
                .description(description)
                .managerId(managerId)
                .joinQuestionYn(joinQuestionYn)
                .joinQuestion(joinQuestion)
                .address(address)
                .cafeRank("새싹")
                .rankUseYn(false)
                .createdAt(LocalDateTime.now())
                .build();
    }
}
