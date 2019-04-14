package com.halbu.ear.Model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "actor_entity")
public class Actor {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private String firstname;
    private String lastname;

    @ManyToMany(mappedBy = "movieofactor")
    Set<Movie> movieofactor;

    public Actor(String id,String firstname,String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Actor(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
