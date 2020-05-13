package com.ricky.entity;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ${description}
 * Created by zhuru on 2020/5/13.
 */
public class TaxiTest {

    private List<Charges> chargesList;

    @BeforeEach
    public void init() {
        chargesList = new ArrayList<>();
        chargesList.add(getCharges_0());
        chargesList.add(getCharges_1());
        chargesList.add(getCharges_2());
        chargesList.add(getCharges_3());
        chargesList.add(getCharges_4());
        chargesList.add(getCharges_5());
    }

    @Test
    public void getFare() {
        Taxi taxi_0 = new Taxi();
        taxi_0.setChargesList(chargesList);
        taxi_0.setGetOnTime(LocalTime.of(13, 10));
        taxi_0.setDistance(13);
        double fare_0 = taxi_0.getFare();
        assertEquals(fare_0, 14 + 7 * 2.5 + 3 * 3.5);
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