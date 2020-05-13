package com.ricky.entity;

/**
 * 收费标准，例：3~10公里(>3且<=10)，白天（早6点到晚6点）每公里2.5元
 * <p>
 * Created by zhuru on 2020/5/13.
 */
public class Charges {
    private DistanceRange distanceRange;
    private TimeRange timeRange;
    private double dropCharge;
    private double rate;

    public double getFare(double miles) {
        miles -= distanceRange.getStart();
        if (miles < 0) {
            return 0;
        } else if (miles > distanceRange.getRange()) {
            miles = distanceRange.getRange();
        }
        return dropCharge + miles * rate;
    }

    public DistanceRange getDistanceRange() {
        return distanceRange;
    }

    public void setDistanceRange(DistanceRange distanceRange) {
        this.distanceRange = distanceRange;
    }

    public TimeRange getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(TimeRange timeRange) {
        this.timeRange = timeRange;
    }

    public double getDropCharge() {
        return dropCharge;
    }

    public void setDropCharge(double dropCharge) {
        this.dropCharge = dropCharge;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
