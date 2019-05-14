package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.SessionDetail;
import com.behavioranalysis.pojo.SessionDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SessionDetailMapper {
    int countByExample(SessionDetailExample example);

    int deleteByExample(SessionDetailExample example);

    int insert(SessionDetail record);

    int insertSelective(SessionDetail record);

    List<SessionDetail> selectByExample(SessionDetailExample example);

    int updateByExampleSelective(@Param("record") SessionDetail record, @Param("example") SessionDetailExample example);

    int updateByExample(@Param("record") SessionDetail record, @Param("example") SessionDetailExample example);
}