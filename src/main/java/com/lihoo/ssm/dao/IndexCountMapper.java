package com.lihoo.ssm.dao;

import com.lihoo.ssm.model.IndexCount;
import java.util.List;

public interface IndexCountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IndexCount record);

    IndexCount selectByPrimaryKey(Long id);

    List<IndexCount> selectAll();

    int updateByPrimaryKey(IndexCount record);
}