package com.abdullah.skillverse.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String content;
    private int like;
    private String comments;
    private String author;
    private String category;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public post() {}

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public int getLike() { return like; }
    public void setLike(int like) { this.like = like; }

    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
}
