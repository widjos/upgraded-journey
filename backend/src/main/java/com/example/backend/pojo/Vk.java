package com.example.backend.pojo;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Vk  implements Serializable{
    public int shares;
    private static final long serialVersionUID = 1L;

    public Vk() {

    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

}
