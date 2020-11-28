package com.tenev.starjournal.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Table(name = "person")
public class Person extends BaseEntity {

    @Column(name = "age")
    private Integer age;
    @Column(name = "name")
    private String name;

    @OneToOne
    private User user;
    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Starship starship;
    @ManyToMany
    @JoinTable(
            name = "person_planet",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "planet_id")
    )
    private Set<Planet> visitedPlanets;
}
