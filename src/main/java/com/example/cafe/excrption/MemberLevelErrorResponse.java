package com.example.cafe.excrption;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberLevelErrorResponse {
    private MemberLevelErrorCode memberLevelErrorCode;
    private String errorMessage;
}
