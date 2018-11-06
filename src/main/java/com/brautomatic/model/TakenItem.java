package com.brautomatic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@ToString
public class TakenItem extends BaseClass {

    @OneToOne
    private User user;
    @OneToOne
    private Disk disk;

}
