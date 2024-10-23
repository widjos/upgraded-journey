package com.example.backend.pojo;

import java.util.ArrayList;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Root implements Serializable {
    public ArrayList<Post> posts;
    public int totalResults;
    public int moreResultsAvailable;
    public String next;
    public int requestsLeft;
    public Object warnings;

    private static final long serialVersionUID = 1L;

    public Root(ArrayList<Post> posts, int totalResults, int moreResultsAvailable, String next, int requestsLeft,
            Object warnings) {
        super();
        this.posts = posts;
        this.totalResults = totalResults;
        this.moreResultsAvailable = moreResultsAvailable;
        this.next = next;
        this.requestsLeft = requestsLeft;
        this.warnings = warnings;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getMoreResultsAvailable() {
        return moreResultsAvailable;
    }

    public void setMoreResultsAvailable(int moreResultsAvailable) {
        this.moreResultsAvailable = moreResultsAvailable;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public int getRequestsLeft() {
        return requestsLeft;
    }

    public void setRequestsLeft(int requestsLeft) {
        this.requestsLeft = requestsLeft;
    }

    public Object getWarnings() {
        return warnings;
    }

    public void setWarnings(Object warnings) {
        this.warnings = warnings;
    }
}