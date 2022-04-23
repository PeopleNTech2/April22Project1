package classobjectmethod;

import java.util.Scanner;

public class Calculator {

	//java class is a blueprint
	
	//class attributes
	//1- variables
	int number1 = 10;
	int number2 = 25;
	
	//2- methods: a reusable block of code that runs when called
	//methodType methodName(){ code to execute }
	
	//return method
	int sub() {
		int total = number1 - number2;
		return total;
	}
	
	double surface(double length, double width) {
		double total = length * width;
		return total;
	}
	
	int cToF(int c) {
		int f = (c * 9/5) + 32;
		return f;
	}
	
	String myName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = sc.nextLine();
		return name;
	}
	
	//non-return method
	void subtraction() {
		int total = number1 - number2;
		System.out.println(total);
	}
	
	void addition(int num1, int num2) {
		int total = num1 + num2;
		System.out.println(total);
	}
}
