package com.org.redis.data;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RedisSetNx {
    private RedisTemplate redisTemplate;

    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    ExecutorService executor = Executors.newFixedThreadPool(10);

    public void main() {
        String key = "a";
        String value = "b";
        executor.submit(() -> {
            ValueOperations valueOperations = redisTemplate.opsForValue();

            boolean flag = valueOperations.setIfAbsent(key, value);
            System.out.println("首加 " + Thread.currentThread().getName() + " flag= " + flag);
            if (flag) {
                valueOperations.set(key, value, 20, TimeUnit.SECONDS);
            }
        });
    }
}
