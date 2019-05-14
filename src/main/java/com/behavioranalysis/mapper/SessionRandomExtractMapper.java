package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.SessionRandomExtract;
import com.behavioranalysis.pojo.SessionRandomExtractExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SessionRandomExtractMapper {
    int countByExample(SessionRandomExtractExample example);

    int deleteByExample(SessionRandomExtractExample example);

    int insert(SessionRandomExtract record);

    int insertSelective(SessionRandomExtract record);

    List<SessionRandomExtract> selectByExample(SessionRandomExtractExample example);

    int updateByExampleSelective(@Param("record") SessionRandomExtract record, @Param("example") SessionRandomExtractExample example);

    int updateByExample(@Param("record") SessionRandomExtract record, @Param("example") SessionRandomExtractExample example);
}