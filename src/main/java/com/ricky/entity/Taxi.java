package com.ricky.entity;

import java.time.LocalTime;
import java.util.List;

/**
 * Created by zhuru on 2020/5/13.
 */
public class Taxi {
    private List<Charges> chargesList;
    private LocalTime getOnTime;
    private LocalTime getOffTime;
    private double distance;

    public double getFare() {
        double fare = 0;
        for (Charges charges : chargesList) {
            if (charges.getTimeRange().isCover(getOnTime)) {
                fare += charges.getFare(distance);
            }
        }
        return fare;
    }

    public List<Charges> getChargesList() {
        return chargesList;
    }

    public void setChargesList(List<Charges> chargesList) {
        this.chargesList = chargesList;
    }

    public LocalTime getGetOnTime() {
        return getOnTime;
    }

    public void setGetOnTime(LocalTime getOnTime) {
        this.getOnTime = getOnTime;
    }

    public LocalTime getGetOffTime() {
        return getOffTime;
    }

    public void setGetOffTime(LocalTime getOffTime) {
        this.getOffTime = getOffTime;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
