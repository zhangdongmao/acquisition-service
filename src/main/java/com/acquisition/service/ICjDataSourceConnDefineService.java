package com.acquisition.service;

import com.acquisition.entity.CjDataSourceConnDefine;
<<<<<<< HEAD
import com.acquisition.mapper.CjDataSourceConnDefineMapper;
=======
import org.springframework.stereotype.Service;
>>>>>>> 3a29d2f1836ce4214fff8f0909f03513e7106b7c

import java.util.List;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@Service
public interface ICjDataSourceConnDefineService {
<<<<<<< HEAD

    List<CjDataSourceConnDefine> selectByExample();

=======
    List<CjDataSourceConnDefine> findAll();
>>>>>>> 3a29d2f1836ce4214fff8f0909f03513e7106b7c
}
