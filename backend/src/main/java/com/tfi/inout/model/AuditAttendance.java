package com.tfi.inout.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "audit_attendance")
public class AuditAttendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eventAttendanceId")
    private EventAttendance eventAttendance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "adminId")
    private User admin;

    @Column(name = "previousValue")
    private String previousValue;

    @Column(name = "newValue")
    private String newValue;

    @Column(name = "date")
    private Instant date;

    @Column(name = "reason")
    private String reason;


}