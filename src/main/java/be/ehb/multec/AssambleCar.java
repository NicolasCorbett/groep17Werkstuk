package be.ehb.multec;
import java.util.ArrayList;
import java.util.List;

public abstract class AssambleCar {

    protected int id;
    protected String color;
    protected boolean turbo;
    protected boolean spoiler;
    protected boolean LEDS;
    protected boolean livery;
    protected double speed;

    protected SoundBarrier breaking;


    final void makeCar(){
        assembleCar();

        if(driverWantsColor()){
            addColor();
        }

        if(driverWantsTurbo()){
            addTurbo();
        }
        if(driverWantsSpoiler()){
            addSpoiler();
        }
        if(driverWantsLEDS()){
            addLEDS();
        }
        if(driverWantsLivery()){
            addLivery();
        }

        startEngine();

    }

    public void assembleCar(){
        System.out.println("A new car is about to be made...");
        System.out.println("The car has started its assembly");
        this.speed = 50;
    }

    abstract void addColor();
    abstract void addTurbo();
    abstract void addSpoiler();
    abstract void addLEDS();
    abstract void addLivery();

    public void setBreakingAbility(SoundBarrier newBreaking){
        breaking = newBreaking;
    }

    public String tryToBreak(){
        return breaking.soundbarrier();
    }

    public SoundBarrier getBreaking() {
        return breaking;
    }

    boolean driverWantsColor(){return true;}
    boolean driverWantsTurbo(){return true;}
    boolean driverWantsSpoiler(){return true;}
    boolean driverWantsLEDS(){return true;}
    boolean driverWantsLivery(){return true;}

    public void startEngine(){
        System.out.println("The car is finished!");
        System.out.println("Add a driver to drive with this car");




    }


}
