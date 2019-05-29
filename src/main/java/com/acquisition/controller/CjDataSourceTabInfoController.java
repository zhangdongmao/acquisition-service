package com.acquisition.controller;

import com.acquisition.entity.Result;
import com.acquisition.service.ICjDataSourceTabInfoService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@RestController
@RequestMapping(value = "/test")
public class CjDataSourceTabInfoController {
    @Autowired
    ICjDataSourceTabInfoService cjDataSourceTabInfoService;

    @PostMapping(value = "/test1")
    public String getObjectownerAndTypeAndUniqueName(){
        cjDataSourceTabInfoService.getAllCjDataSourceTabInfo();
        return Result.ok("参数为null");
    }
}
