package ru.spbstu.telematics.java;

public class RandomGenerator {
    private long initialSeed;
    private ActionContainer actionContainer;

    public RandomGenerator(long seed) {
        this.initialSeed = seed;
        this.actionContainer = new ActionContainer(seed); //6065038420L
    }

    public long getResult() {
        Action lastElement = null;
        for (Action currentAction : actionContainer) {
            lastElement = currentAction;
        }
        return lastElement.getSeed();
    }

    public long getInitialSeed() {
        return this.initialSeed;
    }

    public void setInitialSeed(long seed) {
        this.initialSeed = seed;
        this.actionContainer = new ActionContainer(seed);
    }
}
