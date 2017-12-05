package com.galaxy.framework.gemini.service;

import com.galaxy.framework.gemini.entity.Tenant;
import com.github.pagehelper.Page;

import java.util.List;

public interface TenantService {
    Tenant get(Long id);

    List<Tenant> selectByName(String name);

    Page<Tenant> selectByName(String name, int pageNo, int pageSize);

    Tenant save(Tenant tenant);

    boolean delete(Long id);
}
