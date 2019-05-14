package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.AdStat;
import com.behavioranalysis.pojo.AdStatExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdStatMapper {
    int countByExample(AdStatExample example);

    int deleteByExample(AdStatExample example);

    int insert(AdStat record);

    int insertSelective(AdStat record);

    List<AdStat> selectByExample(AdStatExample example);

    int updateByExampleSelective(@Param("record") AdStat record, @Param("example") AdStatExample example);

    int updateByExample(@Param("record") AdStat record, @Param("example") AdStatExample example);
}