package org.afeng.designpattern.creatingpattern.prototype;

/**
 * 使用原型实例指定要创建对象的类型,通过复制这个原型来创建新对象
 *
 * @author afeng
 * @date 2018/10/6 21:55
 **/
public class Client
{
    public static void main(String[] args)
    {
        Prototype prototype = new ContretePrototype("abc");
        Prototype clone = prototype.myclone();
        System.out.println(clone.toString());
    }


}
