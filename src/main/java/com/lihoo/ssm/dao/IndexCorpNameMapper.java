package com.lihoo.ssm.dao;

import com.lihoo.ssm.model.IndexCorpName;
import java.util.List;

public interface IndexCorpNameMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IndexCorpName record);

    IndexCorpName selectByPrimaryKey(Long id);

    List<IndexCorpName> selectAll();

    int updateByPrimaryKey(IndexCorpName record);
}