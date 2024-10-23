package com.example.backend.pojo;

import java.util.ArrayList;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Entities implements Serializable{

    public ArrayList<Person> persons;
    public ArrayList<Organization> organizations;
    public ArrayList<Location> locations;

    public Entities(ArrayList<Person> persons, ArrayList<Organization> organizations, ArrayList<Location> locations) {
        super();
        this.persons = persons;
        this.organizations = organizations;
        this.locations = locations;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ArrayList<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(ArrayList<Organization> organizations) {
        this.organizations = organizations;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }
    
}