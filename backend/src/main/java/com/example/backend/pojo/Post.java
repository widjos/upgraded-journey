package com.example.backend.pojo;

import java.sql.Date;
import java.util.ArrayList;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Post implements Serializable {
    public Thread thread;
    public String uuid;
    public String url;
    public int ord_in_thread;
    public Object parent_url;
    public String author;
    public Date published;
    public String title;
    public String text;
    public String highlightText;
    public String highlightTitle;
    public String highlightThreadTitle;
    public String language;
    public String sentiment;
    public ArrayList<String> categories;
    public ArrayList<String> external_links;
    public ArrayList<Object> external_images;
    public Entities entities;
    public Object rating;
    public Date crawled;
    public Date updated;

    public Post(Thread thread, String uuid, String url, int ord_in_thread, Object parent_url, String author,
            Date published, String title, String text, String highlightText, String highlightTitle,
            String highlightThreadTitle, String language, String sentiment, ArrayList<String> categories,
            ArrayList<String> external_links, ArrayList<Object> external_images, Entities entities, Object rating,
            Date crawled, Date updated) {
        super();
        this.thread = thread;
        this.uuid = uuid;
        this.url = url;
        this.ord_in_thread = ord_in_thread;
        this.parent_url = parent_url;
        this.author = author;
        this.published = published;
        this.title = title;
        this.text = text;
        this.highlightText = highlightText;
        this.highlightTitle = highlightTitle;
        this.highlightThreadTitle = highlightThreadTitle;
        this.language = language;
        this.sentiment = sentiment;
        this.categories = categories;
        this.external_links = external_links;
        this.external_images = external_images;
        this.entities = entities;
        this.rating = rating;
        this.crawled = crawled;
        this.updated = updated;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOrd_in_thread() {
        return ord_in_thread;
    }

    public void setOrd_in_thread(int ord_in_thread) {
        this.ord_in_thread = ord_in_thread;
    }

    public Object getParent_url() {
        return parent_url;
    }

    public void setParent_url(Object parent_url) {
        this.parent_url = parent_url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getHighlightText() {
        return highlightText;
    }

    public void setHighlightText(String highlightText) {
        this.highlightText = highlightText;
    }

    public String getHighlightTitle() {
        return highlightTitle;
    }

    public void setHighlightTitle(String highlightTitle) {
        this.highlightTitle = highlightTitle;
    }

    public String getHighlightThreadTitle() {
        return highlightThreadTitle;
    }

    public void setHighlightThreadTitle(String highlightThreadTitle) {
        this.highlightThreadTitle = highlightThreadTitle;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public ArrayList<String> getExternal_links() {
        return external_links;
    }

    public void setExternal_links(ArrayList<String> external_links) {
        this.external_links = external_links;
    }

    public ArrayList<Object> getExternal_images() {
        return external_images;
    }

    public void setExternal_images(ArrayList<Object> external_images) {
        this.external_images = external_images;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Date getCrawled() {
        return crawled;
    }

    public void setCrawled(Date crawled) {
        this.crawled = crawled;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}
