package org.afeng.designpattern.structpattern.proxy.impl;

import org.afeng.designpattern.structpattern.proxy.UserDao;

/**
 * @author afeng
 * @date 2018/9/18 14:26
 **/
public class UserDaoImpl implements UserDao
{


    @Override
    public void save()
    {
        System.out.println("保存成功");
    }

    @Override
    public void update()
    {
        System.out.println("更新操作");
    }

    @Override
    public void find()
    {
        System.out.println("查找成功");
    }
}
