package ru.spbstu.telematics.java;

import java.util.Iterator;

public class ActionIterator implements Iterator<Action> {
    private Long seed;
    private Long actionCount;
    private Integer currentStep = -1;
    private final ActionFactory actionFactory;

    public ActionIterator(ActionContainer actionContainer ) {
        actionCount = actionContainer.getActionCount();
        seed = actionContainer.getSeed();
        actionFactory = new ActionFactory(seed);
    }

    public boolean hasNext() {
        return actionCount != -1;
    }

    public Action next() {
        if (currentStep == -1)
            currentStep = (int) Math.floor(seed / Math.pow(10, 8)) % 10 + 2;
        Action nextAction = actionFactory.fabricate(++currentStep);
        nextAction.setSeed(seed);
        nextAction.execOperation();
        seed = nextAction.getSeed();

        if (currentStep == 12) {
            actionCount--;
            currentStep = (int) Math.floor(seed / Math.pow(10, 8)) % 10 + 2;
        }

        return nextAction;
    }

    public void remove() {
    }

}
