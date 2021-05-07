package com.lvlvstart.spring.demo.test;

import com.lvlvstart.spring.demo.SpringDemoApplication;
import com.lvlvstart.spring.demo.entity.Log;
import com.lvlvstart.spring.demo.mapper.LogMapper;
import com.lvlvstart.spring.demo.service.LogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lvlvstart
 * @description 类描述
 * @create 2021/5/7 17:39
 */
@SpringBootTest(classes = SpringDemoApplication.class)
@RunWith(SpringRunner.class)
public class LogServiceTest {


    @Autowired
    private LogService logService;

    @Test
    public void saveLog() {

        Log log = new Log();
        log.setRequestData("haloujava");

        logService.save(log);
    }
}
