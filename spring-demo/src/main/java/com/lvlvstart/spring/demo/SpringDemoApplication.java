package com.lvlvstart.spring.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lvlvstart
 * @description 类描述
 * @create 2021/5/4 22:00
 */
@SpringBootApplication
@EnableAspectJAutoProxy //开启AOP
@MapperScan("com.lvlvstart.spring.demo.mapper")
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
}
