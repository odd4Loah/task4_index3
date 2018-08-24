package com.lihoo.ssm.dao;

import com.lihoo.ssm.model.Banner;
import java.util.List;

public interface BannerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Banner record);

    Banner selectByPrimaryKey(Long id);

    List<Banner> selectAll();

    int updateByPrimaryKey(Banner record);
}