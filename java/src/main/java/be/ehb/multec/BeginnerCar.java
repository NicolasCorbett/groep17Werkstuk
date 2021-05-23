package be.ehb.multec;

public class BeginnerCar extends AssambleCar {

    public BeginnerCar(int id, String color) {
        this.id = id;
        this.color = color;
        this.spoiler = false;
        this.turbo = false;
        this.livery = false;
        this.LEDS = false;
        this.speed = 50;

        breaking = new ItCantBreaksBarrier();
    }

    boolean driverWantsTurbo(){return false;}
    boolean driverWantsSpoiler(){return false;}
    boolean driverWantsLEDS(){return false;}
    boolean driverWantsLivery(){return false;}

    @Override
    void addColor() { }

    @Override
    void addTurbo() { }
    @Override
    void addSpoiler() { }
    @Override
    void addLEDS() { }
    @Override
    void addLivery() { }

    @Override
    public String toString() {
        return "BeginnerCar{" +
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
