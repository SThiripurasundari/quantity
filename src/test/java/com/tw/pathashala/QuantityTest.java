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
    void  checkOneMeterIsEqualToHundredCentimeter() {
        Quantity oneMeter =  meter(1);
        Quantity hundredCentimeter = centimeter(100);

        assertThat(oneMeter, is(equalTo(hundredCentimeter)));

    }

    @Test
    void checkHundredCentimeterIsEqualTOZeroPointZeroZeroOneKilometer() {
        Quantity centimeter = centimeter(100);
        Quantity kilometer = kilometer(0.001);

        assertThat(centimeter,is(equalTo(kilometer)));
    }
}
