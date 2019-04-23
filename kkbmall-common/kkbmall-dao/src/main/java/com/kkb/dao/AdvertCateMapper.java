package com.kkb.dao;

import com.kkb.pojo.AdvertCate;
import java.util.List;

public interface AdvertCateMapper {
    int deleteByPrimaryKey(Integer adCategoryId);

    int insert(AdvertCate record);

    AdvertCate selectByPrimaryKey(Integer adCategoryId);

    List<AdvertCate> selectAll();

    int updateByPrimaryKey(AdvertCate record);
}