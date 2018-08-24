package com.lihoo.ssm.dao;

import com.lihoo.ssm.model.ProfessionTable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProfessionTableMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProfessionTable record);

    ProfessionTable selectByPrimaryKey(Long id);

    List<ProfessionTable> selectAll();

    int updateByPrimaryKey(ProfessionTable record);
}