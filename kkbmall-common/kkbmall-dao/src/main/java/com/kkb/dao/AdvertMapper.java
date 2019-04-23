package com.kkb.dao;

import com.kkb.pojo.Advert;
import java.util.List;

public interface AdvertMapper {
    int deleteByPrimaryKey(Integer adId);

    int insert(Advert record);

    Advert selectByPrimaryKey(Integer adId);

    List<Advert> selectAll();

    int updateByPrimaryKey(Advert record);
}