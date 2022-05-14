package datatype.primitive;

public class Variables {

	public static void main(String[] args) {
		
		//syntax: variableType variableName = variableValue
		
		//primitive variables
		//numbers 
			//whole number
			byte b = 127;//1 byte
			Byte by = 127;
			short s = 2542;//2 bytes
			Short sho = 524;
			int x = 2147483647;//4 bytes
			Integer integer = 15485;
			long l = 654255114158365451L;//8 bytes
			Long lo = 458745125L;
			
			//variable declaration
			int i;
			//variable assignment 
			i = 52;
			
			//use strong names / camel case
			int ageOfTheDog = 25;
			
			int total = i + x;
		
			//fractions
			float f = 1.255454F;//4 bytes
			Float flo = 1.1548754F;
			double d = 1.1244654615461316543183181384435155;//8 bytes
			Double dou = 1.154862655254;
				
		//character
		char a1 = '&';//2 bytes
		Character character = '*';
		char a2 = '+';
				
		//boolean
		boolean boo = true;//1 bit (1/8 byte)
		Boolean bool = false;
		System.out.println(ageOfTheDog);
		System.out.println(i);
		System.out.println(a1);
		System.out.println(boo);
		
		System.out.println(25+85);
		
		System.out.println(a1+a2);
		
		int n, k, p;
		
		int adress = 524;
		
		System.out.println(adress);
		
		adress = 8090;
		
		System.out.println(adress);
		
		
		//java logic: 
		//arithmetic operators: +, -, /, *, %, ++, --
		ageOfTheDog--;
		System.out.println(ageOfTheDog);
		
		//assignment operator: =
		
		//comparison operators: <, >, <=, >=, !=, == 
		String s1 = "hello";
		String s2 = "Hello";
		System.out.println(s1!=s2);
		System.out.println(10>10);
		
		//logical operators: &&, ||, !
		
		String st = "my name is: \\\"John\"\\";
		
		System.out.println("Hello \\ \t World");
		
		//final in variables: you cannot reassign a final variable
		final int age = 20;
		
		//age = 25; //cannot do because age is final 
		
	}

}
