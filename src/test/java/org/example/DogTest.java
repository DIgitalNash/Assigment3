package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest extends Animal{
    Animal Dog = new Dog();

    @Test
    public void testGetType() {
        assertEquals("Mammmal",Dog.getType());
    }

    @Test
    public void testGetLegs() {
        assertTrue("This animal has legs",Dog.hasLegs());
    }

    @Test
    public void testSpeak() {
        assertEquals("Hoof", Dog.speak());
    }
}
