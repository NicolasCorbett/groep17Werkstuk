package be.ehb.multec;
import java.util.ArrayList;


public class main {



    public static void main(String[] args) {

        System.out.println("Starting Formula Car Race");

        ArrayList<String> Autos = new ArrayList<>();
        ArrayList<String> Drivers = new ArrayList<>();
        Autos.add("\n");
        Drivers.add("\n");

        AssambleCar testauto = new TunedCar(7, "red");
        testauto.makeCar();
        System.out.println(testauto.tryToBreak() + "\n");
        testauto.setBreakingAbility(new ItBreaksBarrier());
        System.out.println(testauto.tryToBreak() + "\n");
        Autos.add(testauto.toString()+ "\n");

        AssambleCar test5auto = new ExpertCar(8, "green");
        test5auto.makeCar();
        System.out.println(test5auto.tryToBreak() + "\n");
        Autos.add(test5auto.toString()+ "\n");

        AssambleCar test8auto = new BeginnerCar(12, "purple");
        test8auto.makeCar();
        System.out.println(test8auto.tryToBreak() + "\n");
        Autos.add(test8auto.toString() + "\n");



        Driver Brent = new DriftSkill(new BrakingSkill(new RecoverySkill(new DriverClass(1, "Brent Nekkebroeck", 20, "Male"))));
        System.out.println(Brent.getDescription() + " The skill rating of your Driver is " + Brent.getSkill() + "\n");
        Drivers.add(Brent.getDescription() + " The skill rating of your Driver is " + Brent.getSkill());

        Drivers.add("\n");

        Driver Nicolas = new DriftSkill((new RecoverySkill(new DriverClass(2, "Nico Corbett", 20, "Male"))));
        System.out.println(Nicolas.getDescription() + " The skill rating of your Driver is " + Nicolas.getSkill() + "\n" );
        Drivers.add(Nicolas.getDescription() + " The skill rating of your Driver is " + Nicolas.getSkill() );

        Drivers.add("\n");








        System.out.println("List of cars");
        System.out.println(Autos);

        System.out.println("\n");

        System.out.println("List of Drivers");
        System.out.println(Drivers);




        //System.out.println(testauto.toString());
        //System.out.println(test5auto.toString());
        //System.out.println(test7auto.toString());

    }
}
