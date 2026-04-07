package com.tfi.inout.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventAttendanceDto {
    private Long id;
    private Long attendance;
    private String eventType;
    private LocalTime hour;
    private String device;
    private String state;
}
