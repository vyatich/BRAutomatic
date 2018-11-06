package com.brautomatic.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class TakenItem extends BaseClass {

    @OneToOne
    private User user;
    @OneToOne
    private Disk disk;

}
