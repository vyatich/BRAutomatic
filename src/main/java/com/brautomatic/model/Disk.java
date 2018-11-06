package com.brautomatic.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Disk extends BaseClass {

    private String name;
    @OneToMany
    private User userOwn;

}
