package com.acquisition.service;

import com.acquisition.entity.CjDataSourceConnDefine;
import com.acquisition.mapper.CjDataSourceConnDefineMapper;

import java.util.List;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
public interface ICjDataSourceConnDefineService {

    List<CjDataSourceConnDefine> selectByExample();

}
