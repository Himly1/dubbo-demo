package com.himly.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * create_at:MaZheng
 * create_by:${date} ${time}
 */
public class User implements Serializable {
    public static final Long UID = 13999564732L;

    private Long id;
    private String name;


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
       return ToStringBuilder.reflectionToString(this);
    }
}
