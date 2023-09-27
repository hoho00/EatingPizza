package com.hoho00.game.domain.repository.member;

import java.util.Optional;

public interface MemberRepositoryCustom {
    Optional<Long> updateIsEating(String eatingStatus, Long memberId);
}
