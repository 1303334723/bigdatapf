package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.Top10Category;
import com.behavioranalysis.pojo.Top10CategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Top10CategoryMapper {
    int countByExample(Top10CategoryExample example);

    int deleteByExample(Top10CategoryExample example);

    int insert(Top10Category record);

    int insertSelective(Top10Category record);

    List<Top10Category> selectByExample(Top10CategoryExample example);

    int updateByExampleSelective(@Param("record") Top10Category record, @Param("example") Top10CategoryExample example);

    int updateByExample(@Param("record") Top10Category record, @Param("example") Top10CategoryExample example);
}