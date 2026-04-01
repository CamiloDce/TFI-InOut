package com.tfi.inout.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "state", length = 20)
    private String state;

    @Column(name = "hourWork")
    private Integer hourWork;

    @Column(name = "checkInTolerance")
    private Integer checkInTolerance;

    @Column(name = "checkOutTolerance")
    private Integer checkOutTolerance;


}