package com.ricky.entity;

/**
 * 距离段，取(start, end]
 *
 * Created by zhuru on 2020/5/13.
 */
public class DistanceRange {
    private double start;
    private double end;

    public DistanceRange(double start, double end) {
        this.start = start;
        this.end = end;
    }

    public double getRange() {
        return end - start;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }
}
