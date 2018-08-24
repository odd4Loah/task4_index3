package com.lihoo.ssm.dao;

import com.lihoo.ssm.model.IndexProcess;
import java.util.List;

public interface IndexProcessMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IndexProcess record);

    IndexProcess selectByPrimaryKey(Long id);

    List<IndexProcess> selectAll();

    int updateByPrimaryKey(IndexProcess record);
}