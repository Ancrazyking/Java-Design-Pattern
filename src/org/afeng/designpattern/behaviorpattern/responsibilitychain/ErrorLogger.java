package org.afeng.designpattern.behaviorpattern.responsibilitychain;

/**
 * @author afeng
 * @date 2018/8/22 16:51
 **/
public class ErrorLogger extends AbstractLogger
{

    public ErrorLogger(int level){
        this.level=level;
    }

    @Override
    protected void write(String message)
    {
        System.out.println("Error Console::Logger:"+message);
    }
}
