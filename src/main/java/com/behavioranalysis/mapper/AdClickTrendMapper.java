package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.AdClickTrend;
import com.behavioranalysis.pojo.AdClickTrendExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdClickTrendMapper {
    int countByExample(AdClickTrendExample example);

    int deleteByExample(AdClickTrendExample example);

    int insert(AdClickTrend record);

    int insertSelective(AdClickTrend record);

    List<AdClickTrend> selectByExample(AdClickTrendExample example);

    int updateByExampleSelective(@Param("record") AdClickTrend record, @Param("example") AdClickTrendExample example);

    int updateByExample(@Param("record") AdClickTrend record, @Param("example") AdClickTrendExample example);
}