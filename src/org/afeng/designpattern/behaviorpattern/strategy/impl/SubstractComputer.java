package org.afeng.designpattern.behaviorpattern.strategy.impl;

import org.afeng.designpattern.behaviorpattern.strategy.Computer;

/**
 * @author afeng
 * @date 2018/9/23 15:10
 * 减法策略
 **/
public class SubstractComputer implements Computer
{

    @Override
    public int compute(int num1, int num2)
    {
        return num1-num2;
    }
}
