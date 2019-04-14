package com.halbu.ear.Model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "movie_entity")
public class Movie {

    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String movie_id;
    @Column(name = "name")
    private String name;
    @Column(name = "publishdate")
    private int  publishdate;
    @Column(name = "type")
    private String type;
    @Column(name = "languege")
    private String language;
    @Column(name = "declaration")
    private String declaration;

    public Movie(String  movie_id,String name,int publishdate,String type,String language,String declaration){
        this.movie_id=movie_id;
        this.name=name;
        this.publishdate=publishdate;
        this.type=type;
        this.language=language;
        this.declaration=declaration;
    }

    public Movie(){}


    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String movie_id) {
        this.movie_id = movie_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(int publishdate) {
        this.publishdate = publishdate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }
}
