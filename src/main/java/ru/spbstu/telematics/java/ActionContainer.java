package ru.spbstu.telematics.java;

import java.util.Iterator;

public class ActionContainer implements Iterable<Action> {
    private final Long seed;
    private final Long actionCount;

    public ActionContainer(Long seed) {
        this.seed = seed;
        this.actionCount = (long) Math.floor(seed / Math.pow(10, 9));
    }

    public Long getSeed() {
        return seed;
    }

    public Long getActionCount() {
        return actionCount;
    }

    public Iterator<Action> iterator() {
        return new ActionIterator(this);
    }
}
