package ru.spbstu.telematics.java;

import java.util.Map;

public class ActionFactory
{
    private final Long seed;

    public ActionFactory(Long seed) {
        this.seed = seed;
    }

    public Action fabricate(Integer id)
    {
        Map<Integer, Action> actionMap = Map.of(
                3, new ActionK3(seed),
                4, new ActionK4(seed),
                5, new ActionK5(seed),
                6, new ActionK6(seed),
                7, new ActionK7(seed),
                8, new ActionK5(seed), //it isn't mistake
                9, new ActionK9(seed),
                10, new ActionK10(seed),
                11, new ActionK11(seed),
                12, new ActionK12(seed)
        );

        return actionMap.get(id);
    }


}
