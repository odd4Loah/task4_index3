package com.lihoo.ssm.dao;

import com.lihoo.ssm.model.IndexLearn;
import java.util.List;

public interface IndexLearnMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IndexLearn record);

    IndexLearn selectByPrimaryKey(Long id);

    List<IndexLearn> selectAll();

    int updateByPrimaryKey(IndexLearn record);
}