package com.galaxy.framework.gemini.controller;

import com.galaxy.framework.gemini.entity.Tenant;
import com.galaxy.framework.gemini.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tenant")
public class TenantRestController {
    @Autowired
    private TenantService tenantService;

    @RequestMapping("/{id}")
    public Tenant get(@PathVariable("id")  Long id) {
        return tenantService.get(id);
    }
}
