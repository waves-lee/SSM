package com.waves.mapper;

import com.waves.model.TStaff;
import com.waves.model.TStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStaffMapper {
    long countByExample(TStaffExample example);

    int deleteByExample(TStaffExample example);

    int deleteByPrimaryKey(String id);

    int insert(TStaff record);

    int insertSelective(TStaff record);

    List<TStaff> selectByExample(TStaffExample example);

    TStaff selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TStaff record, @Param("example") TStaffExample example);

    int updateByExample(@Param("record") TStaff record, @Param("example") TStaffExample example);

    int updateByPrimaryKeySelective(TStaff record);

    int updateByPrimaryKey(TStaff record);
}