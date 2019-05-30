package com.acquisition.controller;

import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.entity.Result;
import com.acquisition.service.ICjDataSourceTabInfoService;
import com.acquisition.service.ICjDwCrtTabDdlInfoService;
import com.acquisition.tools.Constant;
import com.acquisition.service.ICjOdsCrtTabDdlInfoService;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


import java.util.List;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@RestController
@RequestMapping(value = "/hiveCreateTable")
public class HiveCreateTableController {

    @Autowired
    ICjDataSourceTabInfoService iCjDataSourceTabInfoService;
    @Autowired
    ICjDwCrtTabDdlInfoService iCjDwCrtTabDdlInfoService;

    private final static Logger LOGGER = LoggerFactory.getLogger(HiveCreateTableController.class);

    @PostMapping(value = "/getDWCreateTabList")
    public String getDWCreateTabList(){
        return Result.ok(JSONObject.toJSON(iCjDataSourceTabInfoService.findAllByOdsHiveAndDwHive(Constant.ODS_CRT_HIVE,Constant.DW_NO_CRT_HIVE)));
    }
    @PostMapping(value = "/dWCreateTable")
    public String dWCreateTable(@RequestBody String data) {
        JSONObject jsonObject = JSONObject.parseObject(data);
        data = jsonObject.getString("data");
        System.out.println(data);
        List<CjDataSourceTabInfo> cjDataSourceTabInfos = JSONObject.parseArray(data, CjDataSourceTabInfo.class);
        iCjDwCrtTabDdlInfoService.createDwTable(cjDataSourceTabInfos);
        return Result.ok("aa");
    }
    /**
     * @return 返回已经导入清单，但没有在ODS建表的表
     */
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
