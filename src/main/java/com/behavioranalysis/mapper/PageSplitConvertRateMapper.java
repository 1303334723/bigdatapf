package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.PageSplitConvertRate;
import com.behavioranalysis.pojo.PageSplitConvertRateExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PageSplitConvertRateMapper {
    int countByExample(PageSplitConvertRateExample example);

    int deleteByExample(PageSplitConvertRateExample example);

    int insert(PageSplitConvertRate record);

    int insertSelective(PageSplitConvertRate record);

    List<PageSplitConvertRate> selectByExample(PageSplitConvertRateExample example);

    int updateByExampleSelective(@Param("record") PageSplitConvertRate record, @Param("example") PageSplitConvertRateExample example);

    int updateByExample(@Param("record") PageSplitConvertRate record, @Param("example") PageSplitConvertRateExample example);
}