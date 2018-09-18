package org.afeng.designpattern.creatingpattern.builder;

/**
 * 建造者模式的核心是开放一个静态内部类专门用来与外界打交道,
 * 来收集用户想要设置的参数并且做检查.
 *
 * @author afeng
 * @date 2018/9/10 14:22
 **/
class SquareBuilder
{
    private int color;
    private int size;
    private int borderColor;
    private int borderSzie;

    /**
     * 构造器私有化,让外类无法直接创建
     *
     * @param builder
     */
    private SquareBuilder(Builder builder)
    {
        this.color = builder.color;
        this.size = builder.size;
        this.borderColor = builder.borderColor;
        this.borderSzie = builder.borderSzie;
    }

    @Override
    public String toString()
    {
        return "SquareBuilder{" +
                "color=" + color +
                ", size=" + size +
                ", borderColor=" + borderColor +
                ", borderSzie=" + borderSzie +
                '}';
    }

    /**
     * 内部建造器类
     */
    public static class Builder
    {
        private int color;
        private int size;
        private int borderColor;
        private int borderSzie;


  /*      public void setColor(int color)
        {
            this.color = color;
        }

        public void setSize(int size)
        {
            this.size = size;
        }

        public void setBorderColor(int borderColor)
        {
            this.borderColor = borderColor;
        }

        public void setBorderSzie(int borderSzie)
        {
            this.borderSzie = borderSzie;
        }*/


        /**
         * 链式调用
         */

        public Builder setColor(int color)
        {
            this.color = color;
            return this;
        }

        public Builder setSize(int size)
        {
            this.size = size;
            return this;
        }

        public Builder setBorderColor(int borderColor)
        {
            this.borderColor = borderColor;
            return this;
        }

        public Builder setBorderSize(int borderSize)
        {
            this.borderSzie = borderSize;
            return this;
        }

        /**
         * 建造者模式
         *
         * @return
         */
        public SquareBuilder build()
        {
            return new SquareBuilder(this);
        }
    }


}
