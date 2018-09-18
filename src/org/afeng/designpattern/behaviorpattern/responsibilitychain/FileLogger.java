package org.afeng.designpattern.behaviorpattern.responsibilitychain;

/**
 * @author afeng
 * @date 2018/8/22 16:52
 **/
public class FileLogger extends AbstractLogger
{

    public FileLogger(int level)
    {
        this.level = level;
    }

    @Override
    protected void write(String message)
    {
        System.out.println("File::Logger:" + message);
    }
}
