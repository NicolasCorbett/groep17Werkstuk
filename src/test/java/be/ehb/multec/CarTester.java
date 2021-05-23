package be.ehb.multec;

import org.junit.Test;


import static org.junit.Assert.*;



public class CarTester {

    @Test
    public void testCarTemplate() {
        MakeCar AutoT1 = new TunedCar(9, "blue");
        AutoT1.makeCar();
        MakeCar AutoT2 = new ExpertCar(10, "blue");
        AutoT2.makeCar();

        assertEquals(AutoT1.getClass().getClass(), AutoT2.getClass().getClass());
        assertNotEquals(AutoT1.speed, AutoT2.speed);

    }
}
