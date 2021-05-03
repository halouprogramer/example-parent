package com.lvlvstart.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lvlvstart
 * @description 代理工厂类
 * @create 2021/5/3 9:59
 */
public class ProxyFactory<T> {


    private ProxyFactory(){}

    private static ProxyFactory proxyFactory = new ProxyFactory();

    public static ProxyFactory getInstance(){
        return proxyFactory;
    }

    public T getJdkProxy(final T obj) {
        T rseult = (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("找西门大官人讨赏");
                Object result = method.invoke(obj, args);
                System.out.println("事后擦屁股");
                return result;
            }
        });
        return rseult;
    }

}
