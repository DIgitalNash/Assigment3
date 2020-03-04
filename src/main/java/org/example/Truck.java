package org.example;

public class Truck implements Vehicle {

    private String model = "M500";
    private String maxLoad = "1000KG";


    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getMaxLoad() {
        return maxLoad;
    }
}
