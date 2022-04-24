package oops.polymorphism;

public class ModernCalculator extends Calculator {

    //method overriding: when method in subclass used the same name, same parameters but different body
    @Override
    public int sub(int x, int y){
        int total = x - y + 10;
        return total;
    }
}
