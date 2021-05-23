package be.ehb.multec;

public class ExpertCar extends AssambleCar {

    public ExpertCar(int id, String color) {
        this.id = id;
        this.color = color;
        this.spoiler = false;
        this.turbo = false;
        this.livery = false;
        this.LEDS = false;
        this.speed = 50;

        breaking = new ItBreaksBarrier();

    }

    @Override
    void addColor() {

    }

    @Override
    void addTurbo() {
        this.turbo = true;
        this.speed += 10;
    }
    @Override
    void addSpoiler() {
        this.spoiler = true;
        this.speed += 10;
    }
    @Override
    void addLEDS() {
        this.LEDS = true;
        this.speed += 10;
    }
    @Override
    void addLivery() {
        this.livery = true;
        this.speed += 10;
    }

    @Override
    public String toString() {
        return "ExpertCar{" +
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
