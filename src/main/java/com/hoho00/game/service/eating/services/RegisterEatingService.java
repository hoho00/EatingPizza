package com.hoho00.game.service.eating.services;

import com.hoho00.game.common.CustomException;
import com.hoho00.game.common.ErrorCode;
import com.hoho00.game.domain.entity.Member;
import com.hoho00.game.domain.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class RegisterEatingService {
    private final MemberRepository memberRepository;

    @Transactional
    public Optional<Long> registerEating(String memberName) throws CustomException, RuntimeException{
        Member member = memberRepository.findByName(memberName).orElseThrow(() -> new CustomException(ErrorCode.MEMBER_NOT_FOUND));
        return memberRepository.updateIsEating("Y", member.getMemberId());
    }
}
