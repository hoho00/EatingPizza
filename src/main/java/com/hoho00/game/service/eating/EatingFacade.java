package com.hoho00.game.service.eating;

import com.hoho00.game.common.CustomException;
import com.hoho00.game.common.ErrorCode;
import com.hoho00.game.domain.entity.Member;
import com.hoho00.game.domain.repository.member.MemberRepository;
import com.hoho00.game.service.eating.services.RegisterEatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EatingFacade {
    private final RegisterEatingService registerEatingService;

    private final MemberRepository memberRepository;

    @Transactional
    public void eat(String memberName, String foodName) throws CustomException, RuntimeException {
        // register game
        Long memberId = registerEatingService.registerEating(memberName).orElseThrow(() -> new CustomException(ErrorCode.MEMBER_NOT_FOUND));
        // triggering

        // response


    }
}
