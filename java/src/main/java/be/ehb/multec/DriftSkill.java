package be.ehb.multec;

public class DriftSkill extends DriverDecorator {

    public DriftSkill(Driver newDriver) {
        super(newDriver);

        System.out.println("Doing Drift Training...");
        System.out.println("Skill rating increased by 10");
    }
    public String getDescription(){

        return tempDriver.getDescription()  ;
    }

    public double getSkill(){
        return tempDriver.getSkill() + 10;
    }
}
