package org.example;

public class Dog extends Animal {

    private String type = "Mammal";
    private boolean hasLegs = true;
    private String sound = "Bark";
    public String getType() {
        return type;
    }
    public boolean hasLegs() {
        return hasLegs;
    }
    public String speak() {
        return sound;
    }
}
