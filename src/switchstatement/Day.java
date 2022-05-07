package switchstatement;

public class Day {

    public void task(Week day) {
        switch (day) {
            case MON:
                System.out.println("mentoring day");
                break;
            case TUE:
                System.out.println("review video");
                break;
            case WED:
                System.out.println("code lab day");
                break;
            case THU:
                System.out.println("homework day");
                break;
            case FRI:
                System.out.println("rest day");
                break;
            case SAT:
                System.out.println("first class");
                break;
            case SUN:
                System.out.println("second class");
                break;
        }

    }

}
