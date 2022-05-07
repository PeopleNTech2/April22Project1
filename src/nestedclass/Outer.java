package nestedclass;

public class Outer {

    //class attributes
    int outerNum = 52;

    Outer(){

    }

    public void outerMethod(){
        System.out.println("this is outer method");
    }

    Inner inner = new Inner();

    class Inner{

        int innerNum = 85;

        Inner(){

        }

        public void innerMethod(){
            System.out.println("this is inner class method");
        }

    }

}
