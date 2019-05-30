package com.acquisition.repository;

import com.acquisition.entity.CjDataSourceTabInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * Created by zhangdongmao on 2019/1/12.
 */
@Mapper
public interface CjDataSourceTableInfoRepository {
    @Select("select * from datalake_meta.cj_data_source_tab_info where data_flag_for_get_cols=#{dataFlagForGetCols} and data_flag_for_crt_ods_dll=#{dataFlagForCrtOdsDll}")
    List<CjDataSourceTabInfo> selectAllByColsAndOds(@Param("dataFlagForGetCols") String dataFlagForGetCols,@Param("dataFlagForCrtOdsDll") String dataFlagForCrtOdsDll);
    @Select("select * from datalake_meta.cj_data_source_tab_info where data_flag_for_crt_ods_hive=#{dataFlagForCrtOdsHive} and data_flag_for_crt_dw_hive=#{dataFlagForCrtDwHive}")
    List<CjDataSourceTabInfo> selectAllByOdsHiveAndDwHive(@Param("dataFlagForCrtOdsHive") String dataFlagForCrtOdsHive,@Param("dataFlagForCrtDwHive") String dataFlagForCrtDwHive);
}
