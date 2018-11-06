package com.brautomatic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
public class Disk extends BaseClass {

    private String name;
    private User userOwn;
}
