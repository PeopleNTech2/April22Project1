package superkw;

public class Child extends Father{

    Child(){
        super(10);
    }

    public void school(){
        super.education();
        super.weight = 190;
    }

}
