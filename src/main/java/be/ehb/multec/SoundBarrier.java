package be.ehb.multec;

public interface SoundBarrier {
    String soundbarrier();
}

class ItBreaksBarrier implements SoundBarrier {

    @Override
    public String soundbarrier() {
        return "Capable of breaking sound barrier";
    }


}

class ItCantBreaksBarrier implements SoundBarrier {

    @Override
    public String soundbarrier() {
        return "Wont be able to break trough sound barrier :(";
    }
}
