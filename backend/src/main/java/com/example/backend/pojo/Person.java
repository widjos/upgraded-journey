package com.example.backend.pojo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Person implements Serializable{

    public String name;
    public String sentiment;

    public Person(String name, String sentiment) {
        super();
        this.name = name;
        this.sentiment = sentiment;
    }

    public String getName() {
        return name;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }
}
   
