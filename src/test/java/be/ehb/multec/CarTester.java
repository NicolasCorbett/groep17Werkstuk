package be.ehb.multec;

import org.junit.Test;


import static org.junit.Assert.*;



public class CarTester {

    @Test
    public void testCarTemplate() {
        AssambleCar AutoT1 = new TunedCar(9, "blue");
        AutoT1.makeCar();
        AssambleCar AutoT2 = new ExpertCar(10, "blue");
        AutoT2.makeCar();

        assertEquals(AutoT1.getClass().getClass(), AutoT2.getClass().getClass());
        assertNotEquals(AutoT1.speed, AutoT2.speed);

    }

    @Test
    public void testDriverDecorator() {

        Driver Test = new DriftSkill(new BrakingSkill(new RecoverySkill(new DriverClass(1, "Brent Nekkebroeck", 20, "Male"))));
        Driver Test2 = new RecoverySkill(new DriftSkill(new DriverClass(2, "Nico Corbett", 28, "Male")));


        assertNotEquals(Test.getSkill(), Test2.getSkill());

    }



    @Test
    public void testCarStrategy() {
        AssambleCar AutoS1 = new TunedCar(9, "blue");
        AutoS1.makeCar();

        String eersteversie = AutoS1.breaking.soundbarrier();
        AutoS1.setBreakingAbility(new ItBreaksBarrier());
        String tweedeeversie = AutoS1.breaking.soundbarrier();


        assertNotEquals(eersteversie, tweedeeversie);
    }
}
