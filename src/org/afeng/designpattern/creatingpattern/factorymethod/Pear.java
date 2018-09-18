package org.afeng.designpattern.creatingpattern.factorymethod;

import sun.java2d.pipe.SpanIterator;

/**
 * @author afeng
 * @date 2018/8/22 15:55
 **/
public class Pear implements Fruit
{
    @Override
    public void print()
    {
        System.out.println("梨");
    }
}
