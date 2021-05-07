package com.lvlvstart.spring.demo.test;

import com.lvlvstart.spring.demo.SpringDemoApplication;
import com.lvlvstart.spring.demo.entity.Log;
import com.lvlvstart.spring.demo.mapper.LogMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lvlvstart
 * @description mapper 测试类
 * @create 2021/5/7 17:26
 */
@SpringBootTest(classes = SpringDemoApplication.class)
@RunWith(SpringRunner.class)
public class LogMapperTest {

    @Autowired
    private LogMapper logMapper;

    @Test
    public void saveLog() {


        Log log = new Log();
        log.setRequestData("halouworld");

        logMapper.insert(log);
    }
}
