package com.example.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String login;
    private String firstname;
    private String lastname;
    private String description;

    public User() {
    }

    public User(String login, String firstname, String lastname, String description) {
        this.login = login;
        this.firstname = firstname;
        this.lastname = lastname;
        this.description = description;
    }
}
