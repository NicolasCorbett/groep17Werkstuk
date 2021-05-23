package be.ehb.multec;

public class RecoverySkill extends DriverDecorator {
    public RecoverySkill(Driver newDriver) {
        super(newDriver);

        System.out.println("Doing Recovery Training...");
        System.out.println("Skill rating increased by 30");
    }
    public String getDescription(){
        return tempDriver.getDescription() ;
    }

    public double getSkill(){
        return tempDriver.getSkill() + 30;
    }
}
