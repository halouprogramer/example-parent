package com.lvlvstart.spring.demo.entity;

import lombok.Data;

/**
 * @author lvzishu@hengbaobank.com
 * @description 描述一个复杂的实体 (假装这是一个复杂的实体)
 * @create 2021/5/4 21:57
 */
@Data
public class ComplexEntity {

    private String name;

    @Override
    public String toString() {
        return "ComplexEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}
