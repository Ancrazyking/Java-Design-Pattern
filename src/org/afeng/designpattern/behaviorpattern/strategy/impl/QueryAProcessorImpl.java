package org.afeng.designpattern.behaviorpattern.strategy.impl;

import org.afeng.designpattern.behaviorpattern.strategy.QueryProcesser;
import org.afeng.designpattern.behaviorpattern.strategy.utils.StringUtils;

import java.util.Map;
import java.util.Objects;

/**
 * @author afeng
 * @date 2018/9/23 10:10
 **/
public class QueryAProcessorImpl implements QueryProcesser
{


    @Override
    public boolean check(Map<String, String> request, Map<String, String> result)
    {

        if (StringUtils.equals(request.get("type"), "b") || Objects.isNull("type"))
        {
            return true;
        }
        return false;
    }

    @Override
    public void handle(Map<String, String> request, Map<String, String> result)
    {
        result.put("A", "item_A");
    }
}
