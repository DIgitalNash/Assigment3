package org.example;

public class Bus implements Vehicle {

    private String model = "X5";
    private String maxLoad = "100KG";

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getMaxLoad() {
        return maxLoad;
    }
}
