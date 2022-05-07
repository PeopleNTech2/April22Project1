package switchstatement;

import java.util.Scanner;

public class TestDay {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter day");
        String myDay = sc.nextLine();
        Day day = new Day();

        day.task(Week.valueOf(myDay));
        day.task(Week.SUN);
    }
}
