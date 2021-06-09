package com.lvlvstart.algorithm.test;

import com.lvlvstart.algorithm.snowflake.SnowflakeIdWorker;
import com.lvlvstart.algorithm.snowflake.SnowflakeIdWorkerFactory;
import org.junit.Test;

/**
 * @author lvzishu@hengbaobank.com
 * @description 雪花算法测试类
 * @create 2021/6/9 9:20
 */
public class SnowflakeTest {


    @Test
    public void testNextId() {


        //错误的用法
        for(int i = 0 ; i < 100 ; i++) {
            SnowflakeIdWorker snowflakeIdWorker1 = new SnowflakeIdWorker(0,0);
            long id = snowflakeIdWorker1.nextId();
            System.out.println(id);
        }

        System.out.println("#############################");


        //正确的用法
        SnowflakeIdWorker snowflakeIdWorker = SnowflakeIdWorkerFactory.getSnowflakeIdWorker();
        for(int i = 0 ; i < 100; i++) {
            long id = snowflakeIdWorker.nextId();
            System.out.println(id);
        }



    }

}
