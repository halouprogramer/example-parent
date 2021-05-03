package com.lvlvstart.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lvlvstart
 * @description 类描述
 * @create 2021/5/3 9:36
 */
public class JDKProxy {


    public static void main(String[] args) {

        final IWangPo panLaoShi = new PanLaoShi();
        ProxyFactory<IWangPo> factory = ProxyFactory.getInstance();

        System.out.println("class:"+panLaoShi.getClass());
        Class<?>[] interfaces = panLaoShi.getClass().getInterfaces();
        if(interfaces != null) {
            for(Class c : interfaces) {
                System.out.println(c.getName());
            }
        }

        IWangPo wangPo =factory.getJdkProxy(panLaoShi);

        wangPo.love();



    }

}
