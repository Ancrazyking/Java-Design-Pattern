package org.afeng.designpattern.creatingpattern.prototype;

/**
 * @author afeng
 * @date 2018/10/6 21:53
 **/
public class ContretePrototype extends Prototype
{
    private String field;

    public ContretePrototype(String field)
    {
        this.field = field;
    }


    @Override
    Prototype myclone()
    {
        return new ContretePrototype(field);
    }

    @Override
    public String toString()
    {
        return field;
    }
}
