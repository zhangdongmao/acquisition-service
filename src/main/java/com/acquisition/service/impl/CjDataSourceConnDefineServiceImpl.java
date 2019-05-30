package com.acquisition.service.impl;

import com.acquisition.entity.CjDataSourceConnDefine;
import com.acquisition.entity.CjDataSourceConnDefineExample;
import com.acquisition.mapper.CjDataSourceConnDefineMapper;
import com.acquisition.service.ICjDataSourceConnDefineService;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by zhangdongmao on 2019/5/29.
 */
public class CjDataSourceConnDefineServiceImpl implements ICjDataSourceConnDefineService {


    @Resource(name = "cjDataSourceConnDefineMapper")
    public CjDataSourceConnDefineMapper cjDataSourceConnDefineMapper;

    @Override
    public List<CjDataSourceConnDefine> selectByExample() {
        CjDataSourceConnDefineExample cjDataSourceConnDefineExample = new CjDataSourceConnDefineExample();
        cjDataSourceConnDefineExample.setOrderByClause("business_system_ID desc");
        return cjDataSourceConnDefineMapper.selectByExample(cjDataSourceConnDefineExample);
    }


}

