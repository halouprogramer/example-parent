package com.lvlvstart.spring.demo.test;

import com.lvlvstart.spring.demo.SpringDemoApplication;
import com.lvlvstart.spring.demo.service.BussinessLogicService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lvlvstart
 * @description 类描述
 * @create 2021/5/7 12:09
 */
@SpringBootTest(classes = SpringDemoApplication.class)
@RunWith(SpringRunner.class)
public class BussinessLogicServiceAopTest {


    @Autowired
    private BussinessLogicService bussinessLogicService;

    @Test
    public void runBussniessTest() {
        bussinessLogicService.runBussniess("halou");
    }

}
