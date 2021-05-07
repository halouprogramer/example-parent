package com.lvlvstart.spring.demo.service.impl;

import com.lvlvstart.spring.demo.service.BussinessLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lvlvstart
 * @description 类描述
 * @create 2021/5/6 13:18
 */
@Slf4j
@Service
public class BussinessLogicServiceImpl implements BussinessLogicService {



    public String runBussniess(String name) {
        log.info("############进入业务逻辑执行方法");
        int i = 1/0;
        return "返回值";
    }
}
