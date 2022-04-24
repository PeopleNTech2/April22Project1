package oops.abstraction;

public class Honda extends ModernCar implements Car, Motor{

    //car interface
    public void start() {
        System.out.println("keyless car");
    }
    public void stop() {
        System.out.println("auto stop");
    }
    //motor interface
    public void engine() {
        System.out.println("v8");
    }
    public void fuel() {
        System.out.println("gas");
    }
    //honda class
    public void navigation(){
        System.out.println("gps system integration");
    }
    public void autoRadio(){
        System.out.println("auto radio included");
    }
    //modern car abstract class
    public void hydraulicBrake() {
        System.out.println("hydraulic brake car");
    }
}
