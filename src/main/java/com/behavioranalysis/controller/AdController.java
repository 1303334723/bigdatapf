package com.behavioranalysis.controller;

import com.behavioranalysis.pojo.*;
import com.behavioranalysis.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ad")
public class AdController {
    @Autowired
    private AdService adService;

    @RequestMapping(value = "/ad-blacklists", method = RequestMethod.GET)
    public List<AdBlacklist> getAdBlacklist() {
        return adService.getAdBlacklist();
    }

    @RequestMapping(value = "/ad-stat/{adId}", method = RequestMethod.GET)
    public List<AdStat> getAdStatByDate(@PathVariable("adId") Integer adId) {
       return adService.getAdStatByDate(adId);
    }

    @RequestMapping(value = "/ad-click-trend/{adId}", method = RequestMethod.GET)
    public List<AdClickTrend> getAdClickTrendByDate(@PathVariable("adId") Integer adId) {
        return adService.getAdClickTrendByDate(adId);
    }
}
