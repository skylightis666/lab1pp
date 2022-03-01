package ru.spbstu.telematics.java;

public class ActionK9 extends Action {
    public ActionK9(Long seed) {
        super(seed);
    }

    public Long execOperation() {
        StringBuilder newSeedStringBuilder = new StringBuilder();
        for(char symbol : seed.toString().toCharArray()) {
            if (symbol == '0')
                newSeedStringBuilder.append(symbol);
            else {
                Integer digit = Character.getNumericValue(symbol);
                newSeedStringBuilder.append(digit - 1);
            }
        }
        seed = Long.parseLong(newSeedStringBuilder.toString());
        return seed;
    }
}
