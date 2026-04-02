package com.tfi.inout.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "event_attendance")
public class EventAttendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attendanceId")
    private Attendance attendance;

    @Column(name = "eventType", length = 50)
    private String eventType;

    @Column(name = "hour")
    private LocalTime hour;

    @Column(name = "device", length = 100)
    private String device;

    @Column(name = "state", length = 20)
    private String state;


}