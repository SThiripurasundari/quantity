package com.tw.pathashala;

public class Centimeter {

    private final double magnitude;
    //km m

    private Centimeter(double magnitude) {
        this.magnitude = magnitude;
    }

    public static Centimeter meter(double magnitude) {

        return new Centimeter(100*magnitude);
    }

    public static Centimeter centimeter(double magnitude) {

        return new Centimeter(magnitude);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Centimeter that = (Centimeter) obj;
        return magnitude == that.magnitude;
    }

}
