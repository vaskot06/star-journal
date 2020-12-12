package com.tenev.starjournal.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Table(name = "planet")
public class Planet extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "information")
    private String information;
    @ManyToMany(mappedBy = "visitedPlanets")
    private Set<User> userVisited;

}
