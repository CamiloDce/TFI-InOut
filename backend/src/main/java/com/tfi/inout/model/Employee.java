package com.tfi.inout.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "lastName", nullable = false, length = 100)
    private String lastName;

    @Column(name = "numberEmployee", length = 50)
    private String numberEmployee;

    @Column(name = "cuil", length = 20)
    private String cuil;

    @Column(name = "dni", length = 20)
    private String dni;

    @Column(name = "state", length = 20)
    private String state;

    @Column(name = "dateEntry")
    private LocalDate dateEntry;


}