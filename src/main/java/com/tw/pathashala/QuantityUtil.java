package com.tw.pathashala;


public class QuantityUtil {

    public static double getInCentimeter(double magnitude, Metrics metrics) {

        return metrics.conversionValue * magnitude;
    }

}
