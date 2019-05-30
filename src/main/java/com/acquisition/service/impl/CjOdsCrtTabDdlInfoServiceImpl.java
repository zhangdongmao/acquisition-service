package com.acquisition.service.impl;

import com.acquisition.service.ICjOdsCrtTabDdlInfoService;
import org.springframework.stereotype.Service;
import com.acquisition.repository.CjOdsCrtTabDdlInfoRepository;
import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.repository.CjDataSourceTabColInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * Created by zhangdongmao on 2019/5/29.
 */
@Service
public class CjOdsCrtTabDdlInfoServiceImpl implements ICjOdsCrtTabDdlInfoService {
    @Autowired
    CjOdsCrtTabDdlInfoRepository cjOdsCrtTabDdlInfoRepository;
    @Override
    public String GetODSTableName(String businessSystemNameShortName, String dataSourceSchema, String dataSourceTable) {
        String odsTableName = "";
        odsTableName = cjOdsCrtTabDdlInfoRepository.selectODSTableNameBySystemAndSchemaAndTable(businessSystemNameShortName, dataSourceSchema, dataSourceTable);
        return odsTableName;
    }

    /**
     * @return 返回指定表的字段详情
     */
    @Autowired
    CjDataSourceTabColInfoRepository CjDataSourceTabColInfoRepository;
    @Override
    public String getODSTableInfo(List<CjDataSourceTabInfo> CjDataSourceTabInfos) {
        String sysName;
        String schemaName;
        String tableName;

        //遍历从前端获取到表的列表
        for(CjDataSourceTabInfo CjDataSourceTabInfo : CjDataSourceTabInfos){
            sysName = CjDataSourceTabInfo.getBusinessSystemNameShortName();
            schemaName =CjDataSourceTabInfo.getDataSourceSchema();
            tableName =CjDataSourceTabInfo.getDataSourceTable();
            System.out.println(sysName   + schemaName  + tableName );
            CjDataSourceTabColInfoRepository.selectAllBySysAndSchemaAndTab(sysName,schemaName,tableName);
        }

        return null;
    }
}
