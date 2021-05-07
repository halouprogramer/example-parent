package com.lvlvstart.spring.demo.aop;

import com.google.gson.Gson;
import com.lvlvstart.spring.demo.common.Conts;
import com.lvlvstart.spring.demo.entity.Log;
import com.lvlvstart.spring.demo.service.LogService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author halouworld
 * @description 类描述
 * @create 2021/5/6 13:20
 */
@Component
@Aspect //表名这是一个切面类
public class LogAop {

    @Autowired
    private LogService logService;


    /**
     * 定义切入点
     * 表达式
     * 访问修饰符（可以省略） 返回值  包名.包名.类名.方法名(参数)
     * .. 表示可以有多个参数也可以为空
     */
    @Pointcut("execution(* com.lvlvstart.spring.demo.service.impl.*.*(..))")
    public void pointcut() {}


    @AfterReturning(value = "pointcut()",returning = "resultValue")
    public void afterIntertLog(JoinPoint joinPoint,Object resultValue) {
        String clazzMothod = joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName();
        Log log = convertToLog(joinPoint.getArgs(), resultValue, clazzMothod);
        logService.save(log);
    }

    @AfterThrowing(value = "pointcut()",throwing = "e")
    public void afterException(JoinPoint joinPoint,Throwable e) {
        String clazzMothod = joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName();
        Log log = convertToLog(joinPoint.getArgs(), e.getMessage(), clazzMothod);
        logService.save(log);
    }


    private Log convertToLog(Object[] args , Object resultValue,String clazzMethod) {

        Log log = new Log();
        log.setRequestData(new Gson().toJson(args));
        log.setClazzMethod(clazzMethod);
        log.setRequestUrl("");
        log.setResponseData(new Gson().toJson(resultValue));
        log.setCreateTime(LocalDateTime.now());
        log.setUpdateTime(LocalDateTime.now());
        log.setStatus(Conts.STATUS_EFFECTIVE);

        return log;

    }







}
