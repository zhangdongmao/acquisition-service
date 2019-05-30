package com.acquisition.repository;

import com.acquisition.entity.CjOdsCrtTabDdlInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Author : Francis Du
 * @Date : Create in 16:29 2019/5/30
 * Modified By :
 */
@Mapper
public interface CjOdsCrtTabDdlInfoRepository {
    @Insert("insert into datalake_meta.cj_ods_crt_tab_ddl_info " +
            "(business_system_ID,business_system_name_short_name,data_source_schema,data_source_table," +
            "ods_data_schema,ods_data_table,ods_data_table_ddl_info,last_modify_dt,last_modify_by) "  +
            "values(#{businessSystemId},#{businessSystemNameShortName},#{dataSourceSchema}," +
            "#{dataSourceTable},#{odsDataSchema},#{odsDataTable},#{odsDataTableDdlInfo}," +
            "#{lastModifyDt},#{lastModifyBy}) ")
    void insertByObject(CjOdsCrtTabDdlInfo cjOdsCrtTabDdlInfo);
}