package org.afeng.designpattern.creatingpattern.factorymethod;

/**
 * @author afeng
 * @date 2018/8/22 15:56
 **/
public class FruitFactory
{
    /**
     * 工厂方法
     * 通过传入的参数,获取不同的对象
     * @param fruitName
     * @return
     */
    public Fruit getFruit(String fruitName)
    {
        if (fruitName.equals("香蕉"))
        {
            return new Banana();
        } else if (fruitName.equals("苹果"))
        {
            return new Apple();
        } else if (fruitName.equals("梨"))
        {
            return new Pear();
        } else
        {
            return null;
        }
    }
}
