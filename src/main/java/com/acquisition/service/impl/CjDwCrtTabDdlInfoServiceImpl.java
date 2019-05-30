package com.acquisition.service.impl;

import com.acquisition.entity.CjDataSourceTabColInfo;
import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.repository.CjDataSourceTabColInfoRepository;
import com.acquisition.service.ICjDwCrtTabDdlInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@Service
public class CjDwCrtTabDdlInfoServiceImpl implements ICjDwCrtTabDdlInfoService{
    @Autowired
    CjDataSourceTabColInfoRepository cjDataSourceTabColInfoRepository;
    private final static Logger LOGGER = LoggerFactory.getLogger(CjDwCrtTabDdlInfoServiceImpl.class);

    @Override
    public String createDwTable(List<CjDataSourceTabInfo> cjDataSourceTabInfoList) {
        String businessSystemNameShortName;
        String dataSourceSchema;
        String dataSourceTable;
        String dwTableName;
        String colName;
        String colType;
        String colComment;
        for (CjDataSourceTabInfo cjDataSourceTabInfo:cjDataSourceTabInfoList){
            businessSystemNameShortName=cjDataSourceTabInfo.getBusinessSystemNameShortName();
            dataSourceSchema=cjDataSourceTabInfo.getDataSourceSchema();
            dataSourceTable=cjDataSourceTabInfo.getDataSourceTable();
            dwTableName="d_nct_"+dataSourceTable;
            StringBuffer dwddl=new StringBuffer();
            dwddl.append("create table data_lake."+dwTableName+"\n");
            List<CjDataSourceTabColInfo> cjDataSourceTabColInfos = cjDataSourceTabColInfoRepository.selectAllBySysAndSchemaAndTab(businessSystemNameShortName, dataSourceSchema, dataSourceTable);
            for(CjDataSourceTabColInfo cjDataSourceTabColInfo:cjDataSourceTabColInfos){
                colName=cjDataSourceTabColInfo.getDataSourceColName();
                colType=cjDataSourceTabColInfo.getDataSourceColDatatype();

            }
        }
        return null;
    }
}
