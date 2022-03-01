package ru.spbstu.telematics.java;

public class ActionK7 extends Action {
    public ActionK7(Long seed) {
        super(seed);
    }

    public Long execOperation() {
        Long magicNumber1 = (long) Math.pow(10, 5);
        seed = magicNumber1 * (seed % magicNumber1) + (long) Math.floor( (double) seed / magicNumber1);
        return seed;
    }
}
