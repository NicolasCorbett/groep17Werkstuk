package be.ehb.multec;

public class BrakingSkill extends DriverDecorator {
    public BrakingSkill(Driver newDriver) {
        super(newDriver);

        System.out.println("Doing Brake Training...");
        System.out.println("Skill rating increased by 20");
    }

    public String getDescription(){

        return tempDriver.getDescription() ;
    }

    public double getSkill(){
        return tempDriver.getSkill() + 20;
    }

}
