package com.lihoo.ssm.dao;

import com.lihoo.ssm.model.IndexStaff;
import java.util.List;

public interface IndexStaffMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IndexStaff record);

    IndexStaff selectByPrimaryKey(Long id);

    List<IndexStaff> selectAll();

    int updateByPrimaryKey(IndexStaff record);
}