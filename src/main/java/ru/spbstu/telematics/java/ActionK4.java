package ru.spbstu.telematics.java;

import java.math.BigInteger;

public class ActionK4 extends Action {
    public ActionK4(Long seed) {
        super(seed);
    }

    public Long execOperation() {
        BigInteger magicNum1 = pow(10L, 5L);
        BigInteger magicNum2 = pow(10L, 10L);
        seed = pow(seed, 2L).divide(magicNum1).mod(magicNum2).longValue();
        return seed;
    }
}
