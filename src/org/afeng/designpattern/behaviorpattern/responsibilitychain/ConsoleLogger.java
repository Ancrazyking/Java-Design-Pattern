package org.afeng.designpattern.behaviorpattern.responsibilitychain;

/**
 * @author afeng
 * @date 2018/8/22 16:50
 **/
public class ConsoleLogger extends AbstractLogger
{
    public ConsoleLogger(int level){
        this.level=level;
    }


    @Override
    protected void write(String message)
    {
        System.out.println("Standard Console::Logger:"+message);
    }
}
