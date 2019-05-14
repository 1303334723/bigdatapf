package com.behavioranalysis.service;

import com.behavioranalysis.pojo.AdBlacklist;
import com.behavioranalysis.pojo.AdClickTrend;
import com.behavioranalysis.pojo.AdStat;

import java.util.List;

public interface AdService {
    public List<AdBlacklist> getAdBlacklist();

    public List<AdStat> getAdStatByDate(Integer adId);

    public List<AdClickTrend> getAdClickTrendByDate(Integer adId);
}
