package com.example.backend.pojo;

import java.sql.Date;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Social implements Serializable{
    public Date updated;
    public Facebook facebook;
    public Vk vk;
    
    public Social(Date updated, Facebook facebook, Vk vk) {
        super();
        this.updated = updated;
        this.facebook = facebook;
        this.vk = vk;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Facebook getFacebook() {
        return facebook;
    }

    public void setFacebook(Facebook facebook) {
        this.facebook = facebook;
    }

    public Vk getVk() {
        return vk;
    }

    public void setVk(Vk vk) {
        this.vk = vk;
    }
}