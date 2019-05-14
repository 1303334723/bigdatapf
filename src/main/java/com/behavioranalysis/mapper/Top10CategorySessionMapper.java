package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.Top10CategorySession;
import com.behavioranalysis.pojo.Top10CategorySessionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Top10CategorySessionMapper {
    int countByExample(Top10CategorySessionExample example);

    int deleteByExample(Top10CategorySessionExample example);

    int insert(Top10CategorySession record);

    int insertSelective(Top10CategorySession record);

    List<Top10CategorySession> selectByExample(Top10CategorySessionExample example);

    int updateByExampleSelective(@Param("record") Top10CategorySession record, @Param("example") Top10CategorySessionExample example);

    int updateByExample(@Param("record") Top10CategorySession record, @Param("example") Top10CategorySessionExample example);
}