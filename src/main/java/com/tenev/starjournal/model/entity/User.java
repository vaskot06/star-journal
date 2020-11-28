package com.tenev.starjournal.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToOne;

@Data
public class User extends BaseEntity {

    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @OneToOne(mappedBy = "user")
    private Person person;
}
