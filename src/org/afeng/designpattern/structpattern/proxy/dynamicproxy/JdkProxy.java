package org.afeng.designpattern.structpattern.proxy.dynamicproxy;

import org.afeng.designpattern.structpattern.proxy.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用JDK动态代理对UserDao产生代理
 * 代理类需要实现InvocationHandler接口
 *
 * @author afeng
 * @date 2018/9/18 14:27
 **/
public class JdkProxy implements InvocationHandler
{
    /**
     * 产生UserDao代理的方法
     * 代理的UserDao方法
     *
     * @return
     */
    private UserDao userDao;

    public JdkProxy(UserDao userDao)
    {
        this.userDao = userDao;
    }

    public UserDao createProxy()
    {
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
        return userDaoProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        if ("save".equals(method.getName()))
        {
            System.out.println("权限校验!");
            return method.invoke(userDao, args);
        }
        return method.invoke(userDao, args);
    }
}
