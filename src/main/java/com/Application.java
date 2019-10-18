package com;

import com.org.redis.data.RedisSetNx;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-bean.xml");
        RedisSetNx redisSetNx = context.getBean(RedisSetNx.class);
        redisSetNx.main();
    }
}
