package com.galaxy.framework.gemini.service.impl;

import com.galaxy.framework.gemini.entity.Tenant;
import com.galaxy.framework.gemini.mapper.TenantMapper;
import com.galaxy.framework.gemini.service.TenantService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantServiceImpl implements TenantService {
    @Autowired
    private TenantMapper tenantMapper;

    @Override
    public Tenant get(Long id) {
        return tenantMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Tenant> selectByName(String name) {
        return tenantMapper.findByName(name);
    }

    @Override
    public Page<Tenant> selectByName(String name, int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<Tenant> tenants = selectByName(name);
        Page<Tenant> page = (Page<Tenant>) tenants;
        return page;
    }

    @Override
    public Tenant save(Tenant tenant) {
        if (tenant.getId() == null) {
            tenantMapper.insert(tenant);
        } else {
            tenantMapper.updateByPrimaryKeySelective(tenant);
        }
        return tenant;
    }

    @Override
    public boolean delete(Long id) {
        Tenant tenant = get(id);
        tenant.setStatus("0");
        tenantMapper.updateByPrimaryKey(tenant);
        return true;
    }
}
