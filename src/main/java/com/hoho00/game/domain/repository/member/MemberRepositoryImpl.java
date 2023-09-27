package com.hoho00.game.domain.repository.member;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.hoho00.game.domain.entity.QMember.member;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom{

    private final JPAQueryFactory jpaQueryFactory;
    @Override
    public Optional<Long> updateIsEating(String eatingStatus, Long memberId) {
        //jpaQueryFactory.update(member).set(member)
        return Optional.empty();
    }
}
