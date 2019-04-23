package com.kkb.dao;

import com.kkb.pojo.Images;
import java.util.List;

public interface ImagesMapper {
    int deleteByPrimaryKey(Integer imgId);

    int insert(Images record);

    Images selectByPrimaryKey(Integer imgId);

    List<Images> selectAll();

    int updateByPrimaryKey(Images record);
}