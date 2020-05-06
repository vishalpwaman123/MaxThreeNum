package com.Max_Number_Test;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    @Test
    public void integerMaxNumber_AtFirst_Position() {

        Maxnumber<Integer> max = new Maxnumber<>(10,1,9,2);
        Assert.assertEquals(10,max.findMaxNumber().intValue());
    }

    @Test
    public void integermaxNumber_AtSecond_position() {
        Maxnumber<Integer> max = new Maxnumber<>(7,10,8);
        Assert.assertEquals(10,max.findMaxNumber().intValue());
    }

    @Test
    public void integermaxNumber_AtThird_position() {
        Maxnumber<Integer> max = new Maxnumber<>(3,7,10);
        Assert.assertEquals(10,max.findMaxNumber().intValue());
    }

    @Test
    public void floatmaxNumber_AtFirst_position() {
        Maxnumber<Float> max = new Maxnumber<>(1.9f,1.3f,1.5f,1.2f);
        Assert.assertEquals(1.9f,max.findMaxNumber(),0.0f);
    }

    @Test
    public void floatmaxNumber_AtSecond_position() {
        Maxnumber<Float> max = new Maxnumber<>(1.2f,1.8f,1.4f);
        Assert.assertEquals(1.8f,max.findMaxNumber(),0.0f);
    }

    @Test
    public void threemaxNumber_AtSecond_position() {
        Maxnumber<Float> max = new Maxnumber<>(1.2f,1.8f,2.2f);
        Assert.assertEquals(2.2f,max.findMaxNumber(),0.0f);
    }

    @Test
    public void stringMaxString_AtFirst_Position() {
        Maxnumber<String> max = new Maxnumber<>( "Peach", "Apple", "Banana", "Fruit", "Hack");
        Assert.assertEquals("Peach", max.findMaxNumber());
    }

    @Test
    public void stringMaxString_AtSecond_Position() {
        Maxnumber<String> max = new Maxnumber<>("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", max.findMaxNumber());
    }

    @Test
    public void stringMaxString_AtThird_Position() {
        Maxnumber<String> max = new Maxnumber<>("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", max.findMaxNumber());
    }

}
