package com.shf.demo01;

import org.junit.Test;

/**
 * 代理模式
 * 抽象角色：一般会使用接口或者抽象类来解决
 * 真实角色：被代理的角色
 * 代理角色： 代理真实角色，代理真实角色后，我们一般会做一些附属操作
 * 客户： 访问代理对象的人
 *
 * 代理模式的好处
 * 可以使真实角色的操作更加纯粹！不用去关注一些公共的业务
 * 公共也就交给代理角色，实现了业务的分工
 * 公共业务发生拓展的时候，方便集中管理
 *
 * 缺点
 * 一个真实角色就会产生一个代理角色；代码量就会翻倍，开发效率就会变低
 */
public class Client {
    private Host host;

    @Test
    public void test1() {
        Host host = new Host();
        host.rent();
    }

    @Test
    public void test2(){
//        房东要租房子
        Host host = new Host();

//        代理,中介帮房东租房子,但是呢?代理一般会有一些附属操作
        Proxy proxy = new Proxy(host);
//        你不用去面对房东,直接找中介租房即可
        proxy.rent();
    }
}
