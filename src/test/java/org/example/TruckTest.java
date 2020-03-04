package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TruckTest {
    Truck v2 = new Truck();

    @Test
    public void getModel() {

        assertEquals("M500", v2.getModel());
    }

    @Test
    public void getMaxLoad() {
        assertEquals("1000KG", v2.getMaxLoad());
    }
}
