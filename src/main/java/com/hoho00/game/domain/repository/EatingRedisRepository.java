package com.hoho00.game.domain.repository;

import com.hoho00.game.domain.entity.Eating;
import org.springframework.data.repository.CrudRepository;

public interface EatingRedisRepository extends CrudRepository<Eating, String> {
}
