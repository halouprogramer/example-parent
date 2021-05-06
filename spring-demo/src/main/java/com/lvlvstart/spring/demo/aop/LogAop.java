package com.lvlvstart.spring.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author halouworld
 * @description 类描述
 * @create 2021/5/6 13:20
 */
@Component
@Aspect //表名这是一个切面类
public class LogAop {


    /**
     * 定义切入点
     * 表达式
     * 访问修饰符（可以省略） 返回值  包名.包名.类名.方法名(参数)
     * .. 表示可以有多个参数也可以为空
     */
    @Pointcut("execution(* com.lvlvstart.spring.demo.service.impl.*.*(..))")
    public void pointcut() {}







}
