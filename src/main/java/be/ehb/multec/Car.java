package be.ehb.multec;
import java.util.Objects;

public class Car {
    private int id;
    private String color;
    private boolean turbo;
    private boolean spoiler;
    private boolean LEDS;
    private boolean livery;
    private double speed;



    public Car(int id, String color, boolean turbo, boolean spoiler, boolean LEDS, boolean livery) {
        this.id = id;
        this.color = color;
        this.turbo = turbo;
        this.spoiler = spoiler;
        this.LEDS = LEDS;
        this.livery = livery;

    }
    public Car(int id) {
        this.id = id;
    }

    public Car() { this.speed = 90; }

    public int getId() { return id; }
    public String getColor() { return color; }
    public boolean isTurbo() { return turbo; }
    public double getSpeed() { return speed; }
    public boolean isSpoiler() { return spoiler; }
    public boolean isLEDS() { return LEDS; }
    public boolean isLivery() { return livery; }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", turbo=" + turbo +
                ", spoiler=" + spoiler +
                ", LEDS=" + LEDS +
                ", livery=" + livery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getId() == car.getId() && isTurbo() == car.isTurbo() && isSpoiler() == car.isSpoiler() && isLEDS() == car.isLEDS() && isLivery() == car.isLivery() && Double.compare(car.getSpeed(), getSpeed()) == 0 && Objects.equals(getColor(), car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getColor(), isTurbo(), isSpoiler(), isLEDS(), isLivery(), getSpeed());
    }
}