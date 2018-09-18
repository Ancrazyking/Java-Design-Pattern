package org.afeng.designpattern.behaviorpattern.responsibilitychain;

/**
 * @author afeng
 * @date 2018/8/22 16:40
 *
 *
 * 责任链模式
 * 拦截的类都实现统一接口
 * Handler里面聚合它自己,在HandleRequest里判断是否合适,如果没达到条件则向下传递,向谁传递之前set进去.
 **/
public abstract class AbstractLogger
{
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    /**
     * 责任链中的下一个元素
     */
    protected AbstractLogger nextLogger;


    public void setNextLogger(AbstractLogger nextLogger)
    {
        this.nextLogger = nextLogger;
    }


    public void logMessage(int level, String message)
    {
        if (this.level <= level)
        {
            write(message);
        }
        if (nextLogger != null)
        {
            nextLogger.logMessage(level, message);
        }

    }

    abstract protected void write(String message);
}
