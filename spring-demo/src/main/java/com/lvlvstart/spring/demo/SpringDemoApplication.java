package com.lvlvstart.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lvzishu@hengbaobank.com
 * @description 类描述
 * @create 2021/5/4 22:00
 */
@SpringBootApplication
@EnableAspectJAutoProxy //开启AOP
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
}
