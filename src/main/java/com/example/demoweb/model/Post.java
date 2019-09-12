package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes = 0;
    private Date creationDate;
    private Long id;

    public Post(Long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Integer getLikes() {
        return likes;
    }

    public String getText() {
        return text;
    }
}
