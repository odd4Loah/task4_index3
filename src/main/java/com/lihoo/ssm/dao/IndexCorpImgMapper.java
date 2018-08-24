package com.lihoo.ssm.dao;

import com.lihoo.ssm.model.IndexCorpImg;
import java.util.List;

public interface IndexCorpImgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IndexCorpImg record);

    IndexCorpImg selectByPrimaryKey(Long id);

    List<IndexCorpImg> selectAll();

    int updateByPrimaryKey(IndexCorpImg record);
}