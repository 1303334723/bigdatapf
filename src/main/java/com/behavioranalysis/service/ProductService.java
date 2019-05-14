package com.behavioranalysis.service;

import com.behavioranalysis.pojo.AreaTop3Product;

import java.util.List;

public interface ProductService {
    public List<AreaTop3Product> getAreaTop3ProductByTaskId(int taskId);
}
