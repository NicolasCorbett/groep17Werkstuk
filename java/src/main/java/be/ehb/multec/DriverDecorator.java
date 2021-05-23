package be.ehb.multec;


import javax.swing.plaf.synth.SynthOptionPaneUI;

abstract class DriverDecorator  implements Driver {


    protected Driver tempDriver;

    public  DriverDecorator(Driver newDriver){
        tempDriver = newDriver;
    }

    public String getDescription(){
        return tempDriver.getDescription();

    }
    public double getSkill(){

        return tempDriver.getSkill();
    }

}
