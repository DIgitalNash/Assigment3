package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CatTest extends Animal {

    Animal Cat = new Cat();
    @Test
    public void testGetType() {
        assertEquals("Mammmal",Cat.getType());
    }

    @Test
    public void testGetLegs() {
        assertTrue("This animal has legs",Cat.hasLegs());
    }

    @Test
    public void testSpeak() {
        assertEquals("Meow", Cat.speak());
    }
}
