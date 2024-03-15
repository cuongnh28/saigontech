package com.example.saigontech.article;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Embedded
    private Author author;

    @Column(unique = true)
    private String title;

    private String content;

    @ElementCollection(targetClass = String.class, fetch =  FetchType.EAGER)
    private List<String> tags = new ArrayList<>();

    public Article() {
    }

    public Article(Author author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    public Long getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public List<String> getTags() {
        return tags;
    }
}
