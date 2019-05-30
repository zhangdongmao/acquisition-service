package com.acquisition.service.impl;

import com.acquisition.entity.Result;
import com.acquisition.repository.CjDataSourceTabColInfoRepository;
import com.acquisition.service.ICjDataSourceTabColInfoService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@Service
public class CjDataSourceTabColInfoServiceImpl implements ICjDataSourceTabColInfoService {

    @Autowired
    CjDataSourceTabColInfoRepository cjDataSourceTabColInfoRepository;

    /**
     * @param businessSystemNameShortName 源系统缩写
     * @param dataSourceSchema schema名
     * @param dataSourceTable 表名
     * @return 返回指定表的字段详情
     */
    @Override
    public String findBySystemAndSchema(String businessSystemNameShortName, String dataSourceSchema ,String dataSourceTable) {
        return Result.ok(JSONObject.toJSON(
                cjDataSourceTabColInfoRepository.selectAllBySysAndSchemaAndTab(businessSystemNameShortName, dataSourceSchema, dataSourceTable)
        ));
    }
}
