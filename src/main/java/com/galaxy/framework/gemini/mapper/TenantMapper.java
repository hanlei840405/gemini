package com.galaxy.framework.gemini.mapper;

import com.galaxy.framework.gemini.entity.Tenant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TenantMapper extends tk.mybatis.mapper.common.Mapper<Tenant> {

    List<Tenant> findByName(String name);
}
