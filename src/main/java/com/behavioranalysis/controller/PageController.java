package com.behavioranalysis.controller;

import com.behavioranalysis.pojo.PageSplitConvertRate;
import com.behavioranalysis.pojo.PageSplitConvertRateExample;
import com.behavioranalysis.service.PageService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/page")
public class PageController {
    @Autowired
    private PageService pageService;

    @RequestMapping(value = "/page-split-convert-rate/{taskId}", method = RequestMethod.GET)
    public PageSplitConvertRate getPageSCRByTaskId(@PathVariable("taskId") int taskId) {
        return pageService.getPageSCRByTaskId(taskId);
    }
}
