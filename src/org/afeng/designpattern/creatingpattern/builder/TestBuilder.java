package org.afeng.designpattern.creatingpattern.builder;

/**
 * @author afeng
 * @date 2018/9/10 14:29
 **/
public class TestBuilder
{
    public static void main(String[] args)
    {
        SquareBuilder.Builder builder = new SquareBuilder.Builder();
      /*  builder.setSize(1);
        builder.setColor(1);
        builder.setBorderColor(1);
        builder.setBorderSize(1);*/
        /**
         * 返回SquareBuilder对象
         */

        /**
         *链式编程        函数式编程
         */
        builder.setColor(1).setBorderColor(1).setSize(1).setBorderSize(1);
        System.out.println(builder.build());
    }


}
