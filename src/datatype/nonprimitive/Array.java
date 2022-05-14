package datatype.nonprimitive;

public class Array {

	public static void main(String[] args) {
		//array is a variable that can hold multiple value in the same time
		//syntax: variableType[] arrayName = {value1, value2, value3...};
		
		int[] myArray = {2, 5, 7, 3, 9};

		System.out.println(myArray);
//		System.out.println(myArray[0]);
//		
//		System.out.println(myArray[4]);
		
		int[] array1 = new int[6];
		array1[0] = 5;
		array1[1] = 9;
		array1[2] = 0;
		array1[3] = 4;
		array1[4] = 3;
		array1[5] = 3;
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		//this is a comment for git
	}
	
}
