package ru.spbstu.telematics.java;


import org.junit.Assert;
import org.junit.Test;

public class AppTest  {
    private final RandomGenerator randomGenerator = new RandomGenerator(0L);

    @Test
    public void testOfEqualityFromBook() {
        randomGenerator.setInitialSeed(6065038420L);
        Assert.assertEquals(randomGenerator.getResult(), 6065038420L);
    }

    @Test
    public void testOfEquality1() {
        randomGenerator.setInitialSeed(3172562687L);
        Assert.assertEquals(randomGenerator.getResult(), 3319967479L);
    }

    @Test
    public void testOfEquality2() {
        randomGenerator.setInitialSeed(48821902);
        Assert.assertEquals(randomGenerator.getResult(), 2009802294L);
    }

    @Test
    public void testOfEquality3() {
        randomGenerator.setInitialSeed(2218966800L);
        Assert.assertEquals(randomGenerator.getResult(), 3320765947L);
    }
}
