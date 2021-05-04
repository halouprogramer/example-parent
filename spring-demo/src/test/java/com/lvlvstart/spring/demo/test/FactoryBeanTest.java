package com.lvlvstart.spring.demo.test;

import com.lvlvstart.spring.demo.SpringDemoApplication;
import com.lvlvstart.spring.demo.entity.ComplexEntity;
import com.lvlvstart.spring.demo.factory.bean.ComplexEntityFactoryBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author lvzishu@hengbaobank.com
 * @description 真正的获得 ComplexEntityFactoryBean 需要 在 name中加上 &符号
 * @create 2021/5/4 22:07
 */
@SpringBootTest(classes = SpringDemoApplication.class)
@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = FactoryBeanConfig.class)
public class FactoryBeanTest {

    @Autowired
    private ComplexEntity complexEntity;

    @Resource(name = "&complexEntityFactoryBeanFactory")
    private ComplexEntityFactoryBean complexEntityFactoryBean;

    @Test
    public void printComplexEntity() {

        System.out.println("===============================");
        System.out.println(complexEntity);
        System.out.println(complexEntityFactoryBean);
        System.out.println("========================");


    }

}
