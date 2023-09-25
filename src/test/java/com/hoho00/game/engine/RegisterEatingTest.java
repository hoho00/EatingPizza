package com.hoho00.game.engine;

import com.hoho00.game.domain.entity.Eating;
import com.hoho00.game.domain.repository.EatingRedisRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RegisterEatingTest {

    @Autowired
    private EatingRedisRepository eatingRedisRepository;

    @Test
    public void register_test() {
        String userName = "testUser";
        String foodName = "testFood";
        Eating eating = new Eating("eatingTest", userName, foodName);

        eatingRedisRepository.save(eating);


//        ValueOperations<String, String> valueOperations =redisTemplate.opsForValue();
//        valueOperations.set(userName, foodName);

//        RegisterEating registerEating = new RegisterEating();
//        RegisterEatingDTO.RegisterEatingResponseDTO dto = registerEating.register(userName, foodName);
        //redisTemplate
    }
}
