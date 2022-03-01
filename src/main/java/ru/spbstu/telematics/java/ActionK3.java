package ru.spbstu.telematics.java;

import java.math.BigInteger;

public class ActionK3 extends Action {
    public ActionK3(Long seed) {
        super(seed);
    }

    public Long execOperation() {
        BigInteger magicNum = pow(10L, 9L).multiply(new BigInteger("5"));
        if (magicNum.compareTo(BigInteger.valueOf(seed)) > 0)
            seed = seed + magicNum.longValue();
        return seed;
    }
}
