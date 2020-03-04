package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest  {

    Bus v1 = new Bus();

    @Test
    public void getModel() {

        assertEquals("X5", v1.getModel());
    }

    @Test
    public void getMaxLoad() {
        assertEquals("100KG", v1.getMaxLoad());
    }
}
