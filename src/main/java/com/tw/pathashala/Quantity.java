package com.tw.pathashala;

public class Quantity {

    private final double magnitude;

    private Quantity(double magnitude) {
        this.magnitude = magnitude;
    }

    public static Quantity meter(double magnitude) {
        return new Quantity(100 * magnitude);
    }

    public static Quantity centimeter(double magnitude) {
        return new Quantity(magnitude);
    }

    public static Quantity kilometer(double magnitude) {
        return new Quantity(magnitude * 100000);
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
        return magnitude == that.magnitude;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
