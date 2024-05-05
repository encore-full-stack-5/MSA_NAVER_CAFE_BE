package com.example.cafe.excrption;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CafeErrorResponse {
    private CafeErrorCode errorCode;
    private String errorMessage;
}
