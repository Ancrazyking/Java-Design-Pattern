package org.afeng.designpattern.creatingpattern.factorymethod;

/**
 * @author afeng
 * @date 2018/8/22 16:00
 **/
public class TestFactory
{
    public static void main(String[] args)
    {
        FruitFactory factory = new FruitFactory();
        Fruit fruit = factory.getFruit("苹果");
        fruit.print();

        Fruit fruit1 = factory.getFruit("香蕉");
        fruit1.print();

        Fruit fruit2 = factory.getFruit("梨");
        fruit2.print();

        /**
         * 为null,报空指针异常
         */
        Fruit fruit3 = factory.getFruit("西瓜");
        fruit3.print();

    }

}
