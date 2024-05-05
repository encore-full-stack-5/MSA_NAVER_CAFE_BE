package com.example.cafe.excrption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum CafeErrorCode {
    CAFE_NOT_FOUND("해당 카페는 존재하지 않습니다.",HttpStatus.NOT_FOUND);

    private final String description;
    private final HttpStatus httpStatus;
}
