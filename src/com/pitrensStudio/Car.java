package com.pitrensStudio;

/**
 * Created by trens on 6/27/2017.
 */
public class Car  extends Vehicle{


    private String type;
    private int door;
    private int color;

    public Car(String type, String size, int wheels, String type1, int door, int color) {
        super(type, size, wheels);
        this.type = type1;
        this.door = door;
        this.color = color;
    }
}
