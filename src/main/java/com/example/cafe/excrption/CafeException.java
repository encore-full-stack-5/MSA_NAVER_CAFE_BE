package com.example.cafe.excrption;

import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@Builder
public class CafeException extends RuntimeException{

    private CafeErrorCode errorCode;
    private String errorMessage;

    public CafeException(CafeErrorCode errorCode){
        this.errorCode = errorCode;
        this.errorMessage = errorCode.getDescription();
    }
}
