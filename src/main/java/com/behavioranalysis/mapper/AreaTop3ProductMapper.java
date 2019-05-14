package com.behavioranalysis.mapper;

import com.behavioranalysis.pojo.AreaTop3Product;
import com.behavioranalysis.pojo.AreaTop3ProductExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AreaTop3ProductMapper {
    int countByExample(AreaTop3ProductExample example);

    int deleteByExample(AreaTop3ProductExample example);

    int insert(AreaTop3Product record);

    int insertSelective(AreaTop3Product record);

    List<AreaTop3Product> selectByExample(AreaTop3ProductExample example);

    int updateByExampleSelective(@Param("record") AreaTop3Product record, @Param("example") AreaTop3ProductExample example);

    int updateByExample(@Param("record") AreaTop3Product record, @Param("example") AreaTop3ProductExample example);
}