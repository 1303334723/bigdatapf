package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.SessionAggrStat;
import com.behavioranalysis.pojo.SessionAggrStatExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SessionAggrStatMapper {
    int countByExample(SessionAggrStatExample example);

    int deleteByExample(SessionAggrStatExample example);

    int insert(SessionAggrStat record);

    int insertSelective(SessionAggrStat record);

    List<SessionAggrStat> selectByExample(SessionAggrStatExample example);

    int updateByExampleSelective(@Param("record") SessionAggrStat record, @Param("example") SessionAggrStatExample example);

    int updateByExample(@Param("record") SessionAggrStat record, @Param("example") SessionAggrStatExample example);
}