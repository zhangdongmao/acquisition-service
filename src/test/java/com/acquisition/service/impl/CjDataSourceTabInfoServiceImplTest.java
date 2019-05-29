package com.acquisition.service.impl;

import com.acquisition.SurgingApplication;
import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.entity.CjDataSourceTabInfoExample;
import com.acquisition.mapper.CjDataSourceTabInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by zhangdongmao on 2019/5/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SurgingApplication.class)
@WebAppConfiguration
@MapperScan("com.acquisition.mapper")
public class CjDataSourceTabInfoServiceImplTest {

    @Test
    public void getAllCjDataSourceTabInfo() {

    }
}