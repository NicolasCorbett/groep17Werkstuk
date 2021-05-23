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


    }
}
