package org.afeng.designpattern.creatingpattern.builder;

/**
 * 有这样一个需求,定义一个类Square
 * 用户可以通过new这个对象来创建不同的Square
 * 则需要不同的属性
 *
 * 用户可以通过设置不同的属性来获得不同的Square类对象
 * @author afeng
 * @date 2018/9/10 14:19
 **/
public class Square
{
    private int size;
    private int borderSize;
    private int borderColor;
    private int color;

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getBorderSize()
    {
        return borderSize;
    }

    public void setBorderSize(int borderSize)
    {
        this.borderSize = borderSize;
    }

    public int getBorderColor()
    {
        return borderColor;
    }

    public void setBorderColor(int borderColor)
    {
        this.borderColor = borderColor;
    }

    public int getColor()
    {
        return color;
    }

    public void setColor(int color)
    {
        this.color = color;
    }
}
