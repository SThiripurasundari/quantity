package com.tw.pathashala;

public enum Metrics
{
    CENTIMETER(1),
    METER(100),
    KILOMETER(100000);

    public Double conversionValue;

    Metrics(double conversionValue) {
        this.conversionValue = conversionValue;
    }
}
