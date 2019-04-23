package com.kkb.controller;

import com.kkb.pojo.Category;
import com.kkb.service.CateGoryService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by apple on 2019/3/27.
 */

@RestController
@RequestMapping("category")
@DubboComponentScan
public class CateGoryController {
    @Reference
    private CateGoryService cateGoryService;

    @RequestMapping("findTree")
    public List<Category> findCateGoryTree(){
        return cateGoryService.findCateGoryTree();
    }


}
