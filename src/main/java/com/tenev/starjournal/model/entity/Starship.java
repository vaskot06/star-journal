package com.tenev.starjournal.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Table(name = "starship")
public class Starship extends BaseEntity{

    @Column(name = "class_type")
    private String classType;
    @Column(name = "serial_number")
    private Long serialNumber;
    @Column(name = "nickname")
    private String nickname;
    @Column(name = "military")
    private Boolean military;
    @OneToOne(mappedBy = "starship")
    private Person person;

}
