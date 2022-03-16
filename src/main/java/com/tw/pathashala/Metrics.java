package com.tw.pathashala;

public enum Metrics {
    CENTIMETER(1),
    METER(100),
    KILOMETER(100000);

    private final Double conversionValue;

    Metrics(double conversionValue) {
        this.conversionValue = conversionValue;
    }

    public static double getInCentimeter(double magnitude, Metrics metrics) {
        return metrics.conversionValue * magnitude;
    }

    public double metricConversion(double magnitude, Metrics metrics) {
        double baseValue = magnitude * metrics.conversionValue;
        return baseValue / this.conversionValue;
    }
}
