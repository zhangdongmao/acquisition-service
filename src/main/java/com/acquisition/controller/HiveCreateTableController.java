package com.acquisition.controller;

import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.entity.Result;
import com.acquisition.service.ICjDataSourceTabColInfoService;
import com.acquisition.service.ICjDataSourceTabInfoService;
import com.acquisition.service.ICjOdsCrtTabDdlInfoService;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@RestController
@RequestMapping(value = "/hiveCreateTable")
public class HiveCreateTableController {

    /**
     * @return 返回已经导入清单，但没有在ODS建表的表
     */
    @Autowired
    ICjDataSourceTabInfoService iCjDataSourceTabInfoService;
    @PostMapping("/getODSTable")
    public String getODSTable(){
        return iCjDataSourceTabInfoService.findAllByColsAndOds("1", "0");
    }


    /**
     * @return 获取前端传来的需要去ODS创建的表信息
     */
    @Autowired
    ICjOdsCrtTabDdlInfoService ICjOdsCrtTabDdlInfoService;
    @PostMapping("/createODSTable")
    public String createODSTable(@RequestBody  String data){
        JSONObject jsonObject = JSONObject.parseObject(data);
        String odsTableList = jsonObject.getString("data");

        List<CjDataSourceTabInfo> cjDataSourceTabInfos = JSONObject.parseArray(odsTableList, CjDataSourceTabInfo.class);
        ICjOdsCrtTabDdlInfoService.getODSTableInfo(cjDataSourceTabInfos);
        return Result.ok("sucess");
    }
}
