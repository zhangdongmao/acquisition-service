package com.acquisition.service;

import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.entity.CjOdsCrtTabDdlInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@Service
public interface ICjOdsCrtTabDdlInfoService {
    String saveDDLAndCreateTable(List<CjDataSourceTabInfo> CjDataSourceTabInfos);
}
