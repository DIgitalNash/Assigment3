package org.example;

public class Cat extends Animal {
    private String type = "Mamma;";
    private boolean hasLegs = true;
    private String sound = "Meow";

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
