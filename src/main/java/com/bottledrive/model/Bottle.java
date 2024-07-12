package com.bottledrive.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "BOTTLE")
@Data
public class Bottle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "number_of_bottles")
    private int numberOfBottles;

    @Column(name = "picked_up")
    private boolean pickedUp;
}
