package org.afeng.designpattern.creatingpattern.prototype;

/**
 * 克隆,使用原型实例指定要创建对象的类型,通过复制这个原型来创建新对象
 * @author afeng
 * @date 2018/10/6 21:52
 **/
public abstract class Prototype
{
    abstract Prototype myclone();
}
