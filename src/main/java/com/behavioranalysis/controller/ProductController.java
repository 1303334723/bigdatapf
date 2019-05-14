package com.behavioranalysis.controller;

import com.behavioranalysis.pojo.AreaTop3Product;
import com.behavioranalysis.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/area-top3-product/{taskId}", method = RequestMethod.GET)
    public List<AreaTop3Product> getAreaTop3ProductByTaskId(@PathVariable("taskId") int taskId) {
        return productService.getAreaTop3ProductByTaskId(taskId);
    }
}
