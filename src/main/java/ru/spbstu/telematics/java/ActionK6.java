package ru.spbstu.telematics.java;

public class ActionK6 extends Action {
    public ActionK6(Long seed) {
        super(seed);
    }

    public Long execOperation() {
        Long magicNumber1 = (long) Math.pow(10, 8);
        Long magicNumber2 = 9814055677L;
        Long magicNumber3 = (long) Math.pow(10, 10);

        if (seed < magicNumber1)
            seed += magicNumber2;
        else
            seed = magicNumber3 - seed;
        return seed;
    }
}
