package com.acquisition.service.impl;

import com.acquisition.repository.CjOdsCrtTabDdlInfoRepository;
import com.acquisition.service.ICjOdsCrtTabDdlInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@Service
public class CjOdsCrtTabDdlInfoServiceImpl implements ICjOdsCrtTabDdlInfoService {
    @Autowired
    CjOdsCrtTabDdlInfoRepository cjOdsCrtTabDdlInfoRepository;
    @Override
    public String GetODSTableName(String businessSystemNameShortName, String dataSourceSchema, String dataSourceTable) {
        String odsTableName="";
        odsTableName = cjOdsCrtTabDdlInfoRepository.selectODSTableNameBySystemAndSchemaAndTable(businessSystemNameShortName, dataSourceSchema, dataSourceTable);
        return odsTableName;
    }
}
