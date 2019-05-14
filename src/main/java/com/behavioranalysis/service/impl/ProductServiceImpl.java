package com.behavioranalysis.service.impl;

import com.behavioranalysis.mapper.AreaTop3ProductMapper;
import com.behavioranalysis.pojo.AreaTop3Product;
import com.behavioranalysis.pojo.AreaTop3ProductExample;
import com.behavioranalysis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private AreaTop3ProductMapper areaTop3ProductMapper;
    @Override
    public List<AreaTop3Product> getAreaTop3ProductByTaskId(int taskId) {
        AreaTop3ProductExample areaTop3ProductExample = new AreaTop3ProductExample();
        AreaTop3ProductExample.Criteria criteria = areaTop3ProductExample.createCriteria();
        criteria.andTaskIdEqualTo(taskId);
        return areaTop3ProductMapper.selectByExample(areaTop3ProductExample);
    }
}
