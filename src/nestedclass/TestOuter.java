package nestedclass;

public class TestOuter {
    public static void main(String[] args) {

        Outer outer = new Outer();

        outer.outerMethod();

        outer.inner.innerMethod();

    }
}
