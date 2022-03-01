package ru.spbstu.telematics.java;

public class ActionK10 extends Action {
    public ActionK10(Long seed) {
        super(seed);
    }

    public Long execOperation() {
        Long magicNumber1 = (long) Math.pow(10, 5);
        Long magicNumber2 = 99999L;

        if (seed < magicNumber1)
            seed = (long) Math.pow(seed, 2) + magicNumber2;
        else
            seed = seed - magicNumber2;
        return seed;
    }
}
