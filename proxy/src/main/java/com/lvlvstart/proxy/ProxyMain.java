package com.lvlvstart.proxy;

/**
 * @author lvlvstart
 * @description
 * JDK 动态代理 和 CGlab 动态代理的区别
 * JDK动态代理 需要实现接口
 * CGLib 实不实现接口无所谓
 * @create 2021/5/3 9:36
 */
public class ProxyMain {


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




        final PanLaoShi panLaoShi1 = new PanLaoShi();
        IWangPo cglibPrody = factory.getCglibPrody(panLaoShi1);
        cglibPrody.love();


    }

}
