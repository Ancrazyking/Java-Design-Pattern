package org.afeng.designpattern.structpattern.proxy.testproxy;

import org.afeng.designpattern.structpattern.proxy.CustomerDao;
import org.afeng.designpattern.structpattern.proxy.UserDao;
import org.afeng.designpattern.structpattern.proxy.cglibproxy.CglibProxy;
import org.afeng.designpattern.structpattern.proxy.dynamicproxy.JdkProxy;
import org.afeng.designpattern.structpattern.proxy.impl.UserDaoImpl;
import org.junit.Test;

/**
 * @author afeng
 * @date 2018/9/18 14:43
 **/
public class test
{
    @Test
    public void testDynamicProxy()
    {
        UserDao userDao = new UserDaoImpl();
        UserDao userDaoProxy = new JdkProxy(userDao).createProxy();
        userDao.save();
        userDao.update();
        userDao.find();
        System.out.println("===================");
        userDaoProxy.save();
        userDaoProxy.find();
        userDaoProxy.update();

    }

    /**
     * 缺失asm.jar
     * 所有会ibao异常,为解决
     */
    @Test
    public void testCglibProxy()
    {
        CustomerDao customerDao = new CustomerDao();
        CustomerDao customerDaoProxy = new CglibProxy(customerDao).CreateCglibProxy();
        customerDao.save();
        System.out.println("=======================");
        customerDaoProxy.save();
    }

}
