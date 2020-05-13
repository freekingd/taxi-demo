package com.ricky.entity;


import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * ${description}
 * Created by zhuru on 2020/5/13.
 */
public class ChargesTest {

    @Test
    public void getFare() {
        double fare_0 = getCharges_0().getFare(11);
        assertEquals(14, fare_0);
        double fare_1 = getCharges_1().getFare(11);
        assertEquals(18, fare_1);
        double fare_2 = getCharges_2().getFare(11);
        assertEquals(2.5 * 7, fare_2);
        double fare_3 = getCharges_3().getFare(11);
        assertEquals(3 * 7, fare_3);
        double fare_4 = getCharges_4().getFare(11);
        assertEquals(1 * 3.5, fare_4);
        double fare_5 = getCharges_5().getFare(11);
        assertEquals(1 * 4.7, fare_5);

    }

    public Charges getCharges_0() {
        Charges charges_0 = new Charges();
        charges_0.setTimeRange(new TimeRange(LocalTime.of(6, 0), LocalTime.of(18, 0)));
        charges_0.setDistanceRange(new DistanceRange(0, 3));
        charges_0.setDropCharge(14);
        charges_0.setRate(0);
        return charges_0;
    }

    public Charges getCharges_1() {
        Charges charges_0 = new Charges();
        charges_0.setTimeRange(new TimeRange(LocalTime.of(18, 0), LocalTime.of(6, 0)));
        charges_0.setDistanceRange(new DistanceRange(0, 3));
        charges_0.setDropCharge(18);
        charges_0.setRate(0);
        return charges_0;
    }

    public Charges getCharges_2() {
        Charges charges_0 = new Charges();
        charges_0.setTimeRange(new TimeRange(LocalTime.of(6, 0), LocalTime.of(18, 0)));
        charges_0.setDistanceRange(new DistanceRange(3, 10));
        charges_0.setDropCharge(0);
        charges_0.setRate(2.5);
        return charges_0;
    }

    public Charges getCharges_3() {
        Charges charges_0 = new Charges();
        charges_0.setTimeRange(new TimeRange(LocalTime.of(18, 0), LocalTime.of(6, 0)));
        charges_0.setDistanceRange(new DistanceRange(3, 10));
        charges_0.setDropCharge(0);
        charges_0.setRate(3);
        return charges_0;
    }

    public Charges getCharges_4() {
        Charges charges_0 = new Charges();
        charges_0.setTimeRange(new TimeRange(LocalTime.of(6, 0), LocalTime.of(18, 0)));
        charges_0.setDistanceRange(new DistanceRange(10, Integer.MAX_VALUE));
        charges_0.setDropCharge(0);
        charges_0.setRate(3.5);
        return charges_0;
    }

    public Charges getCharges_5() {
        Charges charges_0 = new Charges();
        charges_0.setTimeRange(new TimeRange(LocalTime.of(18, 0), LocalTime.of(6, 0)));
        charges_0.setDistanceRange(new DistanceRange(10, Integer.MAX_VALUE));
        charges_0.setDropCharge(0);
        charges_0.setRate(4.7);
        return charges_0;
    }
}