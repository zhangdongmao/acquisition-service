package com.acquisition.service.impl;

import com.acquisition.entity.CjDataSourceTabColInfo;
import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.repository.CjDataSourceTableInfoRepository;
import com.acquisition.service.ICjDataSourceTabInfoService;
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
}
