package org.umss.SIS_UMSS.DTOs;

import java.time.DayOfWeek;

public class ScheduleDTO {
    private DayOfWeek dayOfWeek;
    private String start;
    private String end;

    public ScheduleDTO(DayOfWeek dayOfWeek, String start, String end) {
        this.dayOfWeek = dayOfWeek;
        this.start = start;
        this.end = end;
    }

    public ScheduleDTO() {
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
