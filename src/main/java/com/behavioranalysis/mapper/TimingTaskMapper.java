package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.TimingTask;
import com.behavioranalysis.pojo.TimingTaskExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TimingTaskMapper {
    int countByExample(TimingTaskExample example);

    int deleteByExample(TimingTaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TimingTask record);

    int insertSelective(TimingTask record);

    List<TimingTask> selectByExampleWithBLOBs(TimingTaskExample example);

    List<TimingTask> selectByExample(TimingTaskExample example);

    TimingTask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TimingTask record, @Param("example") TimingTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") TimingTask record, @Param("example") TimingTaskExample example);

    int updateByExample(@Param("record") TimingTask record, @Param("example") TimingTaskExample example);

    int updateByPrimaryKeySelective(TimingTask record);

    int updateByPrimaryKeyWithBLOBs(TimingTask record);

    int updateByPrimaryKey(TimingTask record);
}