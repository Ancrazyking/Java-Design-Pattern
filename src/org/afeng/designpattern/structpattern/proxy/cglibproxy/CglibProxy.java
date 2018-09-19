package org.afeng.designpattern.structpattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.afeng.designpattern.structpattern.proxy.CustomerDao;
import org.afeng.designpattern.structpattern.proxy.UserDao;

import java.lang.reflect.Method;

/**
 * Cglib代理
 * 被代理的类不需要实现接口!
 * 通过实现要被代理的类的一个子类,增强该代理类方法的功能.
 *
 * @author afeng
 * @date 2018/9/18 15:38
 **/
public class CglibProxy implements MethodInterceptor
{
    private CustomerDao customerDao;

    public CglibProxy(CustomerDao customerDao)
    {
        this.customerDao = customerDao;
    }

    public CustomerDao CreateCglibProxy()
    {
        //1.创建cglib的核心对象
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(customerDao.getClass());
        //3.设置回调;(类似于InvocationHandler对象)
        enhancer.setCallback(this);
        //4.创建代理对象
        CustomerDao proxy= (CustomerDao) enhancer.create();

        return  proxy;
    }
    /**
     * 与Jdk动态代理类似
     * <p>
     * intercept是拦截的意思
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
    {
        if ("save".equals(method.getName()))
        {
            System.out.println("权限校验!");
            return methodProxy.invokeSuper(customerDao, objects);
        }
        return methodProxy.invoke(customerDao, objects);
    }
}
