package oops.abstraction;

public abstract class ModernCar {

    //abstract method
    public abstract void hydraulicBrake();

    //non-abstract method
    public void autoLock(){
        System.out.println("auto lock after 10 secs");
    }
}
