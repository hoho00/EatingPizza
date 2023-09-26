package com.hoho00.game.common.response;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;

import org.springframework.http.HttpStatus;
import org.springframework.http.StreamingHttpOutputMessage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {
    private T data;
    private int status;
    private String message;
    private LocalDateTime responseTime;

    public static Response of(String message) {
        return Response.builder()
                .status(200)
                .responseTime(LocalDateTime.now())
                .message(message)
                .build();
    }

    public static <T> Response<T> of(T data, String message) {
        return (Response<T>) Response.builder()
                .status(200)
                .responseTime(LocalDateTime.now())
                .message(message)
                .data(data)
                .build();
    }

    public static <T> Response <T> fail(String message) {
        return (Response<T>) Response.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .responseTime(LocalDateTime.now())
                .message(message)
                .data(Collections.emptyList())
                .build();
    }
}

