package classobjectmethod;

import classobjectconstructor.House;

public class UseCaculator {

	public static void main(String[] args) {
		
		//object: is an instance of a class
		//syntax: ClassName objectName = new ClassName();
		Calculator cal = new Calculator();
		
		int myTotal = cal.sub();
		System.out.println(myTotal);
		
		double mySurface = cal.surface(25.5, 36.0);
		System.out.println(mySurface);
		
		int myTemp = cal.cToF(0);
		System.out.println(myTemp);
		
		//String myName = cal.myName();
		//System.out.println("Hi "+myName+" welcome to java class");
		
		cal.subtraction();
		
		cal.addition(25, 25);
		cal.addition(36, 96);
		cal.addition(74, 95);
		
		House house = new House();
	}

}
