package com.pitrensStudio;

/**
 * Created by trens on 6/27/2017.
 */
public class Vehicle {

    private  String type;
    private  String size;
    private int wheels;

    public Vehicle(String type, String size, int wheels) {
        this.type = type;
        this.size = size;
        this.wheels = wheels;
    }


    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public int getWheels() {
        return wheels;
    }
}
