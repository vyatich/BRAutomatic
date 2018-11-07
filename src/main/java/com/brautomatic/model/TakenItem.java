package com.brautomatic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TakenItem extends BaseClass {

    @OneToOne
    private User user;
    @OneToOne
    private Disk disk;

}
