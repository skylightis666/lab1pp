package ru.spbstu.telematics.java;

public class App 
{
    public static void main( String[] args ) {
        ActionContainer generator = new ActionContainer(6065038420L);
        for (Action currentAction : generator) {
            System.out.println(currentAction.toString() + "  " + currentAction.getSeed());
        }

        Integer int1  = Integer.valueOf(16);
        Integer int2  = Integer.valueOf(16);
        System.out.println(int1==int2);

        var int3  = Integer.valueOf(17);
        var int4  = Integer.valueOf(17);
        System.out.println(int3==int4);
    }
}
