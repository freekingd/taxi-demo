package com.ricky.entity;

import java.time.LocalTime;

/**
 * 时间段，取(start, end]
 *
 * Created by zhuru on 2020/5/13.
 */
public class TimeRange {
    private LocalTime start;
    private LocalTime end;

    public TimeRange(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public boolean isCover(LocalTime time) {
        if (start.isAfter(end)) {
            return time.isAfter(start) || !time.isAfter(end);
        } else {
            return time.isAfter(start) && !time.isAfter(end);
        }
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }
}
