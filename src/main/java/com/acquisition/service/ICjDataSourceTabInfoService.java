package com.acquisition.service;

import com.acquisition.entity.CjDataSourceTabColInfo;
import com.acquisition.entity.CjDataSourceTabInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@Service
public interface ICjDataSourceTabInfoService {
    List<CjDataSourceTabInfo> findAllByOdsHiveAndDwHive(String dataFlagForGetCols,String dataFlagForCrtOdsDll);
    void updcrtDwFlagByObject(CjDataSourceTabInfo cjDataSourceTabInfo);
    String findAllByColsAndOds(String dataFlagForGetCols, String dataFlagForCrtOdsDll);
}
