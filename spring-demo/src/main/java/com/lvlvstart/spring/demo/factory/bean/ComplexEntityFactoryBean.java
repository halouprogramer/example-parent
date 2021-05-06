package com.lvlvstart.spring.demo.factory.bean;

import com.lvlvstart.spring.demo.entity.ComplexEntity;
import lombok.Data;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author lvlvstart
 * @description 类描述
 * @create 2021/5/4 22:02
 */
@Data
@Component
public class ComplexEntityFactoryBean implements FactoryBean<ComplexEntity> {


    private String name;

    public ComplexEntity getObject() throws Exception {

        ComplexEntity complexEntity = new ComplexEntity();
        complexEntity.setName(this.name);
        return complexEntity;

    }

    public Class<?> getObjectType() {
        return ComplexEntity.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
