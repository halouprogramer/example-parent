package com.lvlvstart.algorithm.snowflake;

/**
 * @author lvzishu@hengbaobank.com
 * @description 雪花算法工厂
 * @create 2021/6/9 9:29
 */
public class SnowflakeIdWorkerFactory {


    private final static SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(0,0);


    public static SnowflakeIdWorker getSnowflakeIdWorker() {
        return snowflakeIdWorker;
    }


}
