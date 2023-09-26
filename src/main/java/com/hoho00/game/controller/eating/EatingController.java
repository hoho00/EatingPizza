package com.hoho00.game.controller.eating;

import com.hoho00.game.common.response.Response;
import com.hoho00.game.controller.eating.dto.JandiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/eating")
@RequiredArgsConstructor
public class EatingController {

    @PostMapping("jandi")
    public JandiResponse registerEating(

    ) {
        return JandiResponse.builder().build();
    }
}
