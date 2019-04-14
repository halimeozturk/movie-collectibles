package com.movie.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "user_entity")
public class User {


    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private  String id;
    @Column(name="username")
    private String username;
    private String email;
    @Column(name = "password")
    private String password;

    public User() {}

    public User(String id, String username, String email, String password) {
        super();
        this.id         = id;
        this.username   = username;
        this.email      = email;
        this.password   = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}