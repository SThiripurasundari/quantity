package com.tw.pathashala;

import org.junit.jupiter.api.Test;

import static com.tw.pathashala.Quantity.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


class QuantityTest {


    @Test
    void should_equate_1_cm_to_1_cm() {
        Quantity oneCentimeter = centimeter(1);
        Quantity anotherOneCentimeter = centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Quantity oneCentimeter = centimeter(1);
        Quantity twoCentimeter = centimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }


    @Test
    void checkOneMeterIsEqualToHundredCentimeter() {
        Quantity hundredCentimeter = centimeter(100);
        Quantity oneMeter = meter(1);

        assertThat(oneMeter, is((equalTo(hundredCentimeter))));
    }

    @Test
    void checkHundredCentimeterIsEqualToPointZeroZeroOneKilometer() {
        Quantity hundredCentimeter = centimeter(100);
        Quantity pointZeroZeroOneKm = kilometer(0.001);

        assertThat(hundredCentimeter, is(equalTo(pointZeroZeroOneKm)));
    }

    @Test
    void oneMeterPlusHundredCentimeterIsTwoMeter() {
        Quantity oneMeter = meter(1);
        Quantity hundredCentimeter = centimeter(100);
        Quantity twoMeter = meter(2);

        Quantity oneMeterPlusHundredCentimeter = oneMeter.add(hundredCentimeter);

        assertThat(oneMeterPlusHundredCentimeter, is(equalTo(twoMeter)));
    }

    @Test
    void twoHundredCentimeterPlusOneKilometerIsOneLakhTwoHundredCentimeter() {

        Quantity twoHundredCentimeter = centimeter(200);
        Quantity oneKilometer = kilometer(1);
        Quantity oneLakhTwoHundredCentimeter = centimeter(100200);

        Quantity twoHundredCentimeterPlusOneKilometer = twoHundredCentimeter.add(oneKilometer);

        assertThat(twoHundredCentimeterPlusOneKilometer, is(equalTo(oneLakhTwoHundredCentimeter)));

    }

    @Test
    void should_equate_1m_minus_50cm_is_0_point_5m() {

        Quantity oneMeter = meter(1);
        Quantity fiftyCentimeter = centimeter(50);
        Quantity zeroPointFiveMeter = meter(0.5);

        Quantity oneMeterMinusFiftyCentimeter = oneMeter.subtract(fiftyCentimeter);

        assertThat(oneMeterMinusFiftyCentimeter, is(equalTo(zeroPointFiveMeter)));

    }

    @Test
    void should_equate_2000_cm_minus_1_m_is_1900_cm() {

        Quantity twoThousandCentimeter = centimeter(2000);
        Quantity oneMeter = meter(1);
        Quantity thousandNineHundredCentimeter = centimeter(1900);

        Quantity twoThousandCentimeterMinusOneMeter = twoThousandCentimeter.subtract(oneMeter);

        assertThat(twoThousandCentimeterMinusOneMeter, is(equalTo(thousandNineHundredCentimeter)));



    }



}
