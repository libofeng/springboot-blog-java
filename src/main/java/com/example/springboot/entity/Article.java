package com.example.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
public class Article implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String headline;
    private String content;
    @ManyToOne
    private User author;
    private String slug;
    private LocalDateTime addedAt = LocalDateTime.now();

    public Article() {
    }

    public Article(String title, String headline, String content, User author, String slug) {
        this.title = title;
        this.headline = headline;
        this.content = content;
        this.author = author;
        this.slug = slug;
    }
}
