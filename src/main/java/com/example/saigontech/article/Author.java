package com.example.saigontech.article;

import jakarta.persistence.Embeddable;

@Embeddable
public class Author {
    private String name;
    private String login;

    public Author() {
    }

    public Author(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }
}
