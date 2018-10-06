package org.afeng.designpattern.behaviorpattern.strategy;

import java.util.Map;

/**
 * @author afeng
 * @date 2018/9/23 10:08
 *
 *在策略模式中,一个类的行为或其算法可以在运行时更改.
 * 一个接口,有不同的实现类
 * 根据上下文选择不同的实现类
 * 策略,即选择,多用组合,少用继承
 *
 **/
public interface QueryProcesser
{
    boolean check(Map<String, String> request, Map<String, String> result);

    void handle(Map<String, String> request, Map<String, String> result);
}
