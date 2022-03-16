package com.tw.pathashala;

import static com.tw.pathashala.Metrics.getInCentimeter;

public class Quantity {

    private final double magnitude;
    private final Metrics unit;

    private Quantity(double magnitude, Metrics metrics) {
        this.magnitude = magnitude;
        this.unit = metrics;
    }

    public static Quantity meter(double magnitude) {
        return new Quantity(magnitude, Metrics.METER);
    }

    public static Quantity centimeter(double magnitude) {
        return new Quantity(magnitude, Metrics.CENTIMETER);
    }

    public static Quantity kilometer(double magnitude) {
        return new Quantity(magnitude, Metrics.KILOMETER);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Quantity that = (Quantity) obj;
        return (getInCentimeter(this.magnitude,this.unit) == getInCentimeter(that.magnitude, that.unit));
    }




    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
