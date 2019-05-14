package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.AdBlacklist;
import com.behavioranalysis.pojo.AdBlacklistExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdBlacklistMapper {
    int countByExample(AdBlacklistExample example);

    int deleteByExample(AdBlacklistExample example);

    int insert(AdBlacklist record);

    int insertSelective(AdBlacklist record);

    List<AdBlacklist> selectByExample(AdBlacklistExample example);

    int updateByExampleSelective(@Param("record") AdBlacklist record, @Param("example") AdBlacklistExample example);

    int updateByExample(@Param("record") AdBlacklist record, @Param("example") AdBlacklistExample example);
}