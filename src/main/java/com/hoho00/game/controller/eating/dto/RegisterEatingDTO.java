package com.hoho00.game.controller.eating.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class RegisterEatingDTO {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class RegisterEatingResponseDTO {
        private String userName;
        private String foodName;
        private String status;
    }
}
