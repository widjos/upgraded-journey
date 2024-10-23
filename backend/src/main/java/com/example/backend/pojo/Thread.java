package com.example.backend.pojo;

import java.sql.Date;
import java.util.ArrayList;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Thread  implements Serializable{
    public String uuid;
    public String url;
    public String site_full;
    public String site;
    public String site_section;
    public ArrayList<String> site_categories;
    public String section_title;
    public String title;
    public String title_full;
    public Date published;
    public int replies_count;
    public int participants_count;
    public String site_type;
    public String country;
    public String main_image;
    public int performance_score;
    public int domain_rank;
    public Date domain_rank_updated;
    public Object reach;
    public Social social;

    public Thread(String uuid, String url, String site_full, String site, String site_section,
            ArrayList<String> site_categories, String section_title, String title, String title_full, Date published,
            int replies_count, int participants_count, String site_type, String country, String main_image,
            int performance_score, int domain_rank, Date domain_rank_updated, Object reach, Social social) {
                super();
        this.uuid = uuid;
        this.url = url;
        this.site_full = site_full;
        this.site = site;
        this.site_section = site_section;
        this.site_categories = site_categories;
        this.section_title = section_title;
        this.title = title;
        this.title_full = title_full;
        this.published = published;
        this.replies_count = replies_count;
        this.participants_count = participants_count;
        this.site_type = site_type;
        this.country = country;
        this.main_image = main_image;
        this.performance_score = performance_score;
        this.domain_rank = domain_rank;
        this.domain_rank_updated = domain_rank_updated;
        this.reach = reach;
        this.social = social;
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

    public String getSite_full() {
        return site_full;
    }

    public void setSite_full(String site_full) {
        this.site_full = site_full;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSite_section() {
        return site_section;
    }

    public void setSite_section(String site_section) {
        this.site_section = site_section;
    }

    public ArrayList<String> getSite_categories() {
        return site_categories;
    }

    public void setSite_categories(ArrayList<String> site_categories) {
        this.site_categories = site_categories;
    }

    public String getSection_title() {
        return section_title;
    }

    public void setSection_title(String section_title) {
        this.section_title = section_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_full() {
        return title_full;
    }

    public void setTitle_full(String title_full) {
        this.title_full = title_full;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public int getReplies_count() {
        return replies_count;
    }

    public void setReplies_count(int replies_count) {
        this.replies_count = replies_count;
    }

    public int getParticipants_count() {
        return participants_count;
    }

    public void setParticipants_count(int participants_count) {
        this.participants_count = participants_count;
    }

    public String getSite_type() {
        return site_type;
    }

    public void setSite_type(String site_type) {
        this.site_type = site_type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMain_image() {
        return main_image;
    }

    public void setMain_image(String main_image) {
        this.main_image = main_image;
    }

    public int getPerformance_score() {
        return performance_score;
    }

    public void setPerformance_score(int performance_score) {
        this.performance_score = performance_score;
    }

    public int getDomain_rank() {
        return domain_rank;
    }

    public void setDomain_rank(int domain_rank) {
        this.domain_rank = domain_rank;
    }

    public Date getDomain_rank_updated() {
        return domain_rank_updated;
    }

    public void setDomain_rank_updated(Date domain_rank_updated) {
        this.domain_rank_updated = domain_rank_updated;
    }

    public Object getReach() {
        return reach;
    }

    public void setReach(Object reach) {
        this.reach = reach;
    }

    public Social getSocial() {
        return social;
    }

    public void setSocial(Social social) {
        this.social = social;
    }
}