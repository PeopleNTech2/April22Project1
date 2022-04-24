package oops.abstraction;

public class TestCar {
    public static void main(String[] args) {

        Toyota corolla = new Toyota();
        corolla.start();
        corolla.stop();
        corolla.engine();
        corolla.fuel();

        Honda civic = new Honda();
        civic.start();
        civic.stop();
        civic.engine();
        civic.fuel();

        //cannot create object of interface
        Car accord = new Honda();
        accord.start();
        accord.stop();
    }
}
