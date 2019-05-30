package com.acquisition.service.impl;

<<<<<<< HEAD
import com.acquisition.entity.CjDataSourceConnDefine;
import com.acquisition.entity.CjDataSourceConnDefineExample;
import com.acquisition.mapper.CjDataSourceConnDefineMapper;
import com.acquisition.service.ICjDataSourceConnDefineService;

import javax.annotation.Resource;
import java.util.List;
=======
import org.springframework.stereotype.Service;
>>>>>>> 3a29d2f1836ce4214fff8f0909f03513e7106b7c

/**
 * Created by zhangdongmao on 2019/5/29.
 */
<<<<<<< HEAD
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
=======
@Service
public class CjDataSourceConnDefineServiceImpl {
}
>>>>>>> 3a29d2f1836ce4214fff8f0909f03513e7106b7c
