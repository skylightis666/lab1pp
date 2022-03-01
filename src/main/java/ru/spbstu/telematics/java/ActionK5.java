package ru.spbstu.telematics.java;

import java.math.BigInteger;

public class ActionK5 extends Action {
    public ActionK5(Long seed) {
        super(seed);
    }

    public Long execOperation() {
        BigInteger magicNumber1 = new BigInteger("1001001001");
        BigInteger magicNumber2 = pow(10L, 10L);
        seed = BigInteger.valueOf(seed).multiply(magicNumber1).mod(magicNumber2).longValue();
        return seed;
    }
}
