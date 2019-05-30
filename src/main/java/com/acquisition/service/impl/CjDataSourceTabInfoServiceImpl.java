package com.acquisition.service.impl;

import com.acquisition.entity.CjDataSourceTabColInfo;
import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.entity.Result;
import com.acquisition.repository.CjDataSourceTableInfoRepository;
import com.acquisition.service.ICjDataSourceTabInfoService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@Service
public class CjDataSourceTabInfoServiceImpl implements ICjDataSourceTabInfoService {
    @Autowired
    CjDataSourceTableInfoRepository cjDataSourceTableInfoRepository;

    /**
     * @param dataFlagForGetCols 是否已导入字段清单 1/0 :是/不是
     * @param dataFlagForCrtOdsDll 是否已生成ODS层建表语句 1/0 : 是/不是
     * @return 返回ODS中未创建的表
     */
    @Override
    public String findAllByColsAndOds(String  dataFlagForGetCols, String dataFlagForCrtOdsDll) {
        return  Result.ok(JSONObject.toJSON(
                cjDataSourceTableInfoRepository.selectAllByColsAndOds(dataFlagForGetCols,dataFlagForCrtOdsDll)
        ));
    }

    @Override
    public List<CjDataSourceTabInfo> findAllByOdsHiveAndDwHive(String dataFlagForGetCols,String dataFlagForCrtOdsDll) {
        return cjDataSourceTableInfoRepository.selectAllByOdsHiveAndDwHive(dataFlagForGetCols,dataFlagForCrtOdsDll);
    }

    @Override
    public void updcrtDwFlagByObject(CjDataSourceTabInfo cjDataSourceTabInfo) {
            try {
                cjDataSourceTableInfoRepository.updcrtDwFlagByObject(cjDataSourceTabInfo);
            }catch (Exception e){

            }


    }
    public String susess(){
        return  Result.ok(JSONObject.toJSON("成功"));
    }

}
