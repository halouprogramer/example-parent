package com.lvlvstart.spring.demo.service;

/**
 * 业务逻辑service
 */
public interface BussinessLogicService {


    /**
     * 业务流程，用于aop拦截
     */
    public String runBussniess(String name);
}
