package com.hoho00.game.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    //member error
    MEMBER_NOT_FOUND(400, "MEMBER-400-1", "Not existing member"),


    INTERNAL_SERVER_ERROR(500, "SERVER-500-1", "Internal server error");

    private final int status;
    private final String code;
    private final String message;
    public String getErrorMessage(Object ...arg){
        return String.format(message, arg);
    }
}
