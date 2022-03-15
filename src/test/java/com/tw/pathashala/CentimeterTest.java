package com.tw.pathashala;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {

    @Test
    void should_equate_1_cm_to_1_cm() {
        Centimeter oneCentimeter = Centimeter.centimeter(1);
        Centimeter anotherOneCentimeter = Centimeter.centimeter(1);

        assertThat(oneCentimeter, is(equalTo(anotherOneCentimeter)));
    }

    @Test
    void should_not_equate_1_cm_to_2_cm() {
        Centimeter oneCentimeter = Centimeter.centimeter(1);
        Centimeter twoCentimeter = Centimeter.centimeter(2);

        assertThat(oneCentimeter, is(not(equalTo(twoCentimeter))));
    }


    @Test
    void  checkOneMeterIsEqualToHundredCentimeter() {
        Centimeter oneMeter =  Centimeter.meter(1);
        Centimeter hundredCentimeter = Centimeter.centimeter(100);

        assertThat(oneMeter, is(equalTo(hundredCentimeter)));

    }

}
