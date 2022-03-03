package com.shf.demo04;



import com.shf.demo03.Rent;
import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//自动生成代理类
@Data
public class ProxyInvocationHandler implements InvocationHandler {
//    被代理的接口
    private Object target;

    //    生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

//    处理代理实例,并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
//        动态代理的本质,就是使用反射机制实现
        return method.invoke(target, args);
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
