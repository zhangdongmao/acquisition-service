package com.acquisition.repository;

import com.acquisition.entity.CjDataSourceTabInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * Created by zhangdongmao on 2019/1/12.
 */
@Mapper
public interface CjDataSourceTableInfoServiceRepository {
    @Select("select * from datalake_meta.cj_data_source_tab_info")
    List<CjDataSourceTabInfo> selectAll();
}
