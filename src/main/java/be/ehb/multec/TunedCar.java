package be.ehb.multec;

public class TunedCar extends MakeCar {


    public TunedCar(int id, String color) {
        this.id = id;
        this.color = color;
        this.spoiler = false;
        this.turbo = false;
        this.livery = false;
        this.LEDS = false;
        this.speed = 50;



    }



    boolean driverWantsLEDS(){return false;}
    boolean driverWantsLivery(){return false;}

    @Override
    void addColor() {

    }

    @Override
    void addTurbo() {
        System.out.println("Turbo was added");
        System.out.println("The maximum speed therefore increased by 10 to 110km/h");
        this.turbo = true;
        this.speed += 10;

    }
    @Override
    void addSpoiler() {
        System.out.println("Spoiler was added");
        System.out.println("Speed is increased to 125km/h");
        this.spoiler= true;
        this.speed += 15;

    }
    @Override
    void addLEDS() { }
    @Override
    void addLivery() { }


    @Override
    public String toString() {
        return "TunedCar{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", turbo=" + turbo +
                ", spoiler=" + spoiler +
                ", LEDS=" + LEDS +
                ", livery=" + livery +
                ", speed=" + speed +
                '}';
    }
}

