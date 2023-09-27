package com.hoho00.game.controller.eating;

import com.hoho00.game.common.CustomException;
import com.hoho00.game.common.response.Response;
import com.hoho00.game.controller.eating.dto.JandiResponse;
import com.hoho00.game.controller.eating.dto.SlackResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/eating")
@RequiredArgsConstructor
public class EatingController {

    @PostMapping("jandi")
    public JandiResponse registerEatingByJandi(

    ) throws Exception {
        return JandiResponse.builder().build();
    }


    @ExceptionHandler(CustomException.class)
    @PostMapping("slack")
    public SlackResponse registerEatingSlack(

    ) throws Exception, CustomException, RuntimeException {
        return SlackResponse.builder().build();
    }
}
