package switchstatement;

public class Day {

	public static void main(String[] args) {
		
		String day = "Mon";
		
		switch(day) {
			case "Mon":
				System.out.println("mentoring day");
				break;
			case "Tue":	
				System.out.println("review video");
				break;
			case "Wed":	
				System.out.println("code lab day");
				break;
			case "Thu":	
				System.out.println("homework day");
				break;
			case "Fri":	
				System.out.println("rest day");
				break;
			case "Sat":	
				System.out.println("first class");
				break;
			case "Sun":	
				System.out.println("second class");
				break;
			default:
				System.out.println("invalid day");
		}

	}

}
