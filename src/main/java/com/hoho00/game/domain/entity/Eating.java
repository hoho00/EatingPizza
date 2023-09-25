package com.hoho00.game.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@Getter
@AllArgsConstructor
@RedisHash(value = "eating")
public class Eating {
    @Id
    private String eatingId;

    private String userName;

    private String foodName;
}
