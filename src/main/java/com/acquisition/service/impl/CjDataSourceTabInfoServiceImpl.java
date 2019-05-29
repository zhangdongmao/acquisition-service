package com.acquisition.service.impl;

import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.mapper.CjDataSourceTabColInfoMapper;
import com.acquisition.mapper.CjDataSourceTabInfoMapper;
import com.acquisition.repository.CjDataSourceTableInfoServiceRepository;
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
    CjDataSourceTableInfoServiceRepository cjDataSourceTableInfoServiceRepository;
    @Override
    public List<CjDataSourceTabInfo> getAllCjDataSourceTabInfo() {
        System.out.println(cjDataSourceTableInfoServiceRepository.selectAll().get(0).getBusinessSystemId());
        return cjDataSourceTableInfoServiceRepository.selectAll();
    }
}
