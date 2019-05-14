package com.behavioranalysis.service.impl;

import com.behavioranalysis.mapper.PageSplitConvertRateMapper;
import com.behavioranalysis.pojo.PageSplitConvertRate;
import com.behavioranalysis.pojo.PageSplitConvertRateExample;
import com.behavioranalysis.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageServiceImpl implements PageService {
    @Autowired
    PageSplitConvertRateMapper pageSplitConvertRateMapper;

    @Override
    public PageSplitConvertRate getPageSCRByTaskId(int taskId) {
        PageSplitConvertRateExample pageSplitConvertRateExample = new PageSplitConvertRateExample();
        PageSplitConvertRateExample.Criteria criteria = pageSplitConvertRateExample.createCriteria();
        criteria.andTaskidEqualTo(taskId);
        return pageSplitConvertRateMapper.selectByExample(pageSplitConvertRateExample).get(0);
    }
}
