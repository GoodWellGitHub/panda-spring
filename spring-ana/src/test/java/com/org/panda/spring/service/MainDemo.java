package com.org.panda.spring.service;

import com.org.panda.spring.scanner.MyComponent;
import org.junit.Test;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.Arrays;

public class MainDemo {
    @Test
    public void test2(){
        AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext(TestConfig.class);
        Arrays.stream(configApplicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }

    @Test
    public void classPathBeanDefinitionScannerTest(){
        String BASE_PACKAGE="com.org.panda.spring.scanner";

        //1.创建一个IoC容器，用于装载ClassPathBeanDefinitionScanner扫描出的BeanDefinition
        SimpleBeanDefinitionRegistry registry=new SimpleBeanDefinitionRegistry();

        /**
         * 2.创建一个Scanner扫描器，useDefaultFilters：是否使用默认过滤器，默认该值为true，
         * 即会把@Component注解的Bean都扫描出来，这里我们不需要这个功能，只需要扫描我们自定义注解的Bean
         */
        ClassPathBeanDefinitionScanner scanner=new ClassPathBeanDefinitionScanner(registry,false);

        //3.这里注册一个注解类型过滤器，完成对自定义注解Bean过滤
        scanner.addIncludeFilter(new AnnotationTypeFilter(MyComponent.class));

        /**
         * 4.是否向IoC中注册用于用于处理核心注解的6个PostProcessor，默认true
         * AnnotationConfigUtils.registerAnnotationConfigProcessors(this.registry)
         */
        scanner.setIncludeAnnotationConfig(false);

        int beanCount=scanner.scan(BASE_PACKAGE);

        String[] beanDefinitiionNames=registry.getBeanDefinitionNames();

        System.out.println("bean count:"+beanCount);

        Arrays.stream(beanDefinitiionNames).forEach(System.out::println);
    }
}
