package datatype.nonprimitive;

public class UseString {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World";
		
		//String concatenation
		System.out.println(str1+str2);
		System.out.println(str1+524);
		
		//string manipulation
		System.out.println(str1.indexOf("H"));
		System.out.println(str1.equals(str2));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());

	}

}
