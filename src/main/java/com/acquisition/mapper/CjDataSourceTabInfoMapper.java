package com.acquisition.mapper;

import java.util.List;

import com.acquisition.entity.CjDataSourceTabColInfo;
import com.acquisition.entity.CjDataSourceTabInfo;
import com.acquisition.entity.CjDataSourceTabInfoExample;
import com.acquisition.entity.CjDataSourceTabInfoKey;
import org.apache.ibatis.annotations.Param;

public interface CjDataSourceTabInfoMapper {

    List<CjDataSourceTabInfo> selectAll();
}