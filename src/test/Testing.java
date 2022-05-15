package test;

import org.junit.Assert;
import org.junit.Test;

public class Testing {

    @Test
    public void test1() {
        int actual = 10;
        int expected = 10;
        //validation
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int actual = 10;
        int expected = 10;
        //validation
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3() {
        int actual = 10;
        int expected = 9;
        //validation
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        int i = 10;
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
    }

}
