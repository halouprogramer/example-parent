package com.lvlvstart.spring.demo.config;

import com.lvlvstart.spring.demo.entity.ComplexEntity;
import com.lvlvstart.spring.demo.factory.bean.ComplexEntityFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lvzishu@hengbaobank.com
 * @description 配置使用工厂Bean
 * @create 2021/5/4 22:15
 */
@Configuration
public class FactoryBeanConfig {

    @Bean(name = "complexEntityFactoryBeanFactory")
    public ComplexEntityFactoryBean complexEntityFactoryBeanFactory() {
        ComplexEntityFactoryBean complexEntityFactoryBean = new ComplexEntityFactoryBean();
        complexEntityFactoryBean.setName("hello world");
        return complexEntityFactoryBean;
    }

    @Bean(name = "complexEntity")
    public ComplexEntity complexEntity() throws Exception {
        return complexEntityFactoryBeanFactory().getObject();
    }
}
