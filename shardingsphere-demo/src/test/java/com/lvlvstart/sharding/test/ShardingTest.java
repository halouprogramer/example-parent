package com.lvlvstart.sharding.test;

import com.lvlvstart.sharding.demo.StartApplication;
import com.lvlvstart.sharding.demo.entity.Student;
import com.lvlvstart.sharding.demo.repository.StudentRespository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 类描述
 *
 * @author lvzishu
 * @since 2021/11/21 21:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartApplication.class)
public class ShardingTest {

    @Autowired
    private StudentRespository studentRespository;

    @Test
    public void addStudent() {

        for(int i =  0 ; i < 10 ; i++) {
            Student student = new Student();
            student.setName("halouworld");
            student.setClassId(new Long(i));
            studentRespository.save(student);
        }


    }

}
