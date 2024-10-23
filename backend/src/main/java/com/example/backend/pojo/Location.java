package com.example.backend.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Location implements Serializable{

    public String name;
    public String sentiment;

    public Location(String name, String sentiment) {
        super();
        this.name = name;
        this.sentiment = sentiment;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSentiment() {
        return sentiment;
    }
    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }
}
