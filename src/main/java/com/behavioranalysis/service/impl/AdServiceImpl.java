package com.behavioranalysis.service.impl;

import com.behavioranalysis.mapper.AdBlacklistMapper;
import com.behavioranalysis.mapper.AdClickTrendMapper;
import com.behavioranalysis.mapper.AdStatMapper;
import com.behavioranalysis.pojo.*;
import com.behavioranalysis.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private AdBlacklistMapper adBlacklistMapper;
    @Autowired
    private AdStatMapper adStatMapper;
    @Autowired
    private AdClickTrendMapper adClickTrendMapper;

    @Override
    public List<AdBlacklist> getAdBlacklist() {
        AdBlacklistExample adBlacklistExample = new AdBlacklistExample();
        AdBlacklistExample.Criteria criteria = adBlacklistExample.createCriteria();
        return adBlacklistMapper.selectByExample(adBlacklistExample);
    }

    @Override
    public List<AdStat> getAdStatByDate(Integer adId) {
        AdStatExample adStatExample = new AdStatExample();
        AdStatExample.Criteria criteria = adStatExample.createCriteria();
        SimpleDateFormat dateFormat1 =
                new SimpleDateFormat("yyyyMMdd");
        String date = dateFormat1.format(new Date());
        criteria.andDateEqualTo("20190510");
        criteria.andAdIdEqualTo(adId);
        return adStatMapper.selectByExample(adStatExample);
    }

    @Override
    public List<AdClickTrend> getAdClickTrendByDate(Integer adId) {
        AdClickTrendExample adClickTrendExample = new AdClickTrendExample();
        AdClickTrendExample.Criteria criteria = adClickTrendExample.createCriteria();
        // 获取今天的日期yyyy-MM-dd，当前小时-上一个小时，adId
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        String currentTime = sdf.format(new Date());
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat dateFormat1 =
                new SimpleDateFormat("yyyy-MM-dd");
        String date = "";
        try {
            date = dateFormat1.format(dateFormat.parse(currentTime.substring(0, 8)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String currentHour = currentTime.substring(8, 10);
        int currentHour_int = Integer.parseInt(currentHour);
        String lastHour = "";
        // 0 1 2 3 4 5 ... 21 22 23
        if (currentHour_int == 0) {
            lastHour = "23";
        } else {
            lastHour = String.valueOf(currentHour_int - 1);
        }
        criteria.andAdIdEqualTo(adId);
        criteria.andDateEqualTo("2019-05-10");
        criteria.andHourBetween("10", "11");
        return adClickTrendMapper.selectByExample(adClickTrendExample);
    }
}
