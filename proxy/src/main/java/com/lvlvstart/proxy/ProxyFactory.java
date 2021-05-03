package com.lvlvstart.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

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

    /**
     * JDK动态带来
     * @param obj
     * @return
     */
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


    public T getCglibPrody(final T obj) {
        return (T) Enhancer.create(obj.getClass(), new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("找西门官人");
                Object result = method.invoke(obj,objects);
                System.out.println("事后擦屁股");
                return result;
            }
        });
    }

}
