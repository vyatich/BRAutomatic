package com.brautomatic.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Disk extends BaseClass {

    private String name;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
