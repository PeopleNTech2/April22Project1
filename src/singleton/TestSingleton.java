package singleton;

public class TestSingleton {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();

        singleton.doWork();
    }
}
