package com.galaxy.framework.gemini.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Table;
import java.io.Serializable;

@Setter
@Getter
@Table(name = "tenant", schema = "galaxy")
public class Tenant extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -3180772752604780673L;

    private String name;
}
