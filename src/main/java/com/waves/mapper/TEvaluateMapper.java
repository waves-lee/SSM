package com.waves.mapper;

import com.waves.model.TEvaluate;
import com.waves.model.TEvaluateExample;
import com.waves.model.TEvaluateKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEvaluateMapper {
    long countByExample(TEvaluateExample example);

    int deleteByExample(TEvaluateExample example);

    int deleteByPrimaryKey(TEvaluateKey key);

    int insert(TEvaluate record);

    int insertSelective(TEvaluate record);

    List<TEvaluate> selectByExample(TEvaluateExample example);

    TEvaluate selectByPrimaryKey(TEvaluateKey key);

    int updateByExampleSelective(@Param("record") TEvaluate record, @Param("example") TEvaluateExample example);

    int updateByExample(@Param("record") TEvaluate record, @Param("example") TEvaluateExample example);

    int updateByPrimaryKeySelective(TEvaluate record);

    int updateByPrimaryKey(TEvaluate record);
}