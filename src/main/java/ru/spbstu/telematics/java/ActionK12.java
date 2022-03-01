package ru.spbstu.telematics.java;

import java.math.BigInteger;

public class ActionK12 extends Action {
    public ActionK12(Long seed) {
        super(seed);
    }

    public Long execOperation() {
        BigInteger magicNumber1 = pow(10L, 5L);
        BigInteger magicNumber2 = pow(10L, 10L);
        BigInteger bigSeed = BigInteger.valueOf(seed);
        seed = bigSeed.multiply(bigSeed.add(BigInteger.valueOf(-1L))).divide(magicNumber1).mod(magicNumber2).longValue();
        return seed;
    }
}
