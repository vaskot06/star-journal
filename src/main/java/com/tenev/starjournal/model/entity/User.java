package com.tenev.starjournal.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
public class User extends BaseEntity {

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private Integer age;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Starship starship;
    @ManyToMany
    @JoinTable(
            name = "user_planet",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "planet_id")
    )
    private Set<Planet> visitedPlanets;
}
