package com.example.cafe.excrption;

import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@Builder
public class MemberLevelException extends RuntimeException{

    private MemberLevelErrorCode errorCode;
    private String errorMessage;

    public MemberLevelException(MemberLevelErrorCode errorCode){
        this.errorCode = errorCode;
        this.errorMessage = errorCode.getDescription();
    }
}
