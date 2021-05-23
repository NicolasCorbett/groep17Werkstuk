package be.ehb.multec;


public class main {

    public static void main(String[] args) {

        System.out.println("Starting Formula Car Race");

        MakeCar testauto = new TunedCar(7, "red");
        testauto.makeCar();

        MakeCar test5auto = new ExpertCar(8, "green");
        test5auto.makeCar();

        MakeCar test8auto = new BeginnerCar(12, "purple");
        test8auto.makeCar();




        Driver Brent = new DriftSkill(new BrakingSkill(new RecoverySkill(new DriverClass(1, "Brent Nekkebroeck", 20, "Male"))));
        System.out.println(Brent.getDescription() + " The skill rating of your Driver is " + Brent.getSkill() + "\n");

        Driver Nicolas = new DriftSkill((new RecoverySkill(new DriverClass(2, "Nico Corbett", 20, "Male"))));
        System.out.println(Nicolas.getDescription() + " The skill rating of your Driver is " + Nicolas.getSkill() + "\n" );
        

    }
}
