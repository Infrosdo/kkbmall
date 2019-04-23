package com.kkb.service.impl;

import com.kkb.dao.CategoryMapper;
import com.kkb.pojo.Category;
import com.kkb.service.CateGoryService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by apple on 2019/3/27.
 */
@Service
public class CateGoryServiceImpl implements CateGoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findCateGoryTree() {
        return categoryMapper.selectAll();
    }
}
