package com.hoho00.game.common;

import com.hoho00.game.common.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.hoho00.game.common.ErrorCode.INTERNAL_SERVER_ERROR;

@RestControllerAdvice
public class ExceptionHandlers {
    @ExceptionHandler({CustomException.class})
    protected ResponseEntity<?> handleCustomException(CustomException customException) {
        return ResponseEntity.ok(
                ErrorResponse.of(customException.getErrorCode().getStatus(), customException.getMessage())
        );
    }

    @ExceptionHandler({Exception.class})
    protected ResponseEntity<?> handleServerException(Exception exception) {
        return ResponseEntity.ok(
                ErrorResponse.of(INTERNAL_SERVER_ERROR.getStatus(), INTERNAL_SERVER_ERROR.getMessage())
        );
    }
}
