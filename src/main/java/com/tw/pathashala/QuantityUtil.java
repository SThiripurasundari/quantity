package com.tw.pathashala;

import static com.tw.pathashala.Metrics.*;

public class QuantityUtil {

    //private static final double KILOMETER_TO_CENTIMETER = 100000;
    //private static final double METER_TO_CENTIMETER = 100;

    public static double getInCentimeter(double magnitude, Metrics metrics) {
            return metrics.conversionValue * magnitude;
    }


}
