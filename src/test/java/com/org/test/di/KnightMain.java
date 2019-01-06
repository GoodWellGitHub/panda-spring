package com.org.test.di;

import com.org.service.Knight;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void  main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("di/spring_bean.xml");
        Knight knight=context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
