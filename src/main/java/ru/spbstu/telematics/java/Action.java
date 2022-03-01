package ru.spbstu.telematics.java;


import java.math.BigInteger;

public abstract class Action {
    public static BigInteger pow(Long value, Long powValue) {
        BigInteger bigInt = new BigInteger(String.valueOf(value));
        if (powValue == 1) {
            return bigInt;
        } else {
            return bigInt.multiply(pow(value, powValue - 1));
        }
    }

    protected Long seed;
    public Action(Long seed) {
        this.seed = seed;
    }
    public void setSeed(Long seed) {
        this.seed = seed;
    }
    public Long getSeed() {
        return seed;
    }

    public abstract Long execOperation();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        char[] arr = getClass().getName().toCharArray();
        stringBuilder.append(arr[arr.length-2]);
        stringBuilder.append(arr[arr.length-1]);
        return stringBuilder.toString(); //fix K
    }
}
