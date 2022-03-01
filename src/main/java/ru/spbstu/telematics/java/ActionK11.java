package ru.spbstu.telematics.java;

public class ActionK11 extends Action {
    public ActionK11(Long seed) {
        super(seed);
    }

    public Long execOperation() {
        Long magicNumber1 = (long) Math.pow(10, 9);
        for (int i = 0; i < 2; i++) {
            if (seed < magicNumber1)
                seed *= 10;
        }
        return seed;
    }
}
