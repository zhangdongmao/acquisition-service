package com.acquisition.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zhangdongmao on 2019/5/30.
 */
@Mapper
public interface CjOdsCrtTabDdlInfoRepository {
    @Select("select distinct ods_data_table from datalake_meta.cj_ods_crt_tab_ddl_info where business_system_name_short_name=#{businessSystemNameShortName} and data_source_schema=#{dataSourceSchema} and data_source_table=#{dataSourceTable}")
    String selectODSTableNameBySystemAndSchemaAndTable(@Param("businessSystemNameShortName") String businessSystemNameShortName, @Param("dataSourceSchema") String dataSourceSchema, @Param("dataSourceTable") String dataSourceTable);
}
