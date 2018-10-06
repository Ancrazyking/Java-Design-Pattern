package org.afeng.designpattern.behaviorpattern.strategy.utils;

/**
 * @author afeng
 * @date 2018/9/23 10:17
 **/
public class StringUtils
{
    public static boolean equals(String a, String b)
    {

        if (a.trim().equalsIgnoreCase(b.trim()))
        {
            return true;
        }
        return false;
    }
}
