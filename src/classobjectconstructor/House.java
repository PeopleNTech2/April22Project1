package classobjectconstructor;

public class House {
	
	//variables
	int address;
	String houseName;
	private char unit;
	
	//constructors
	//built constructors 
	public House(String myHouseName){
		houseName = myHouseName;
	}
	
	House(String myHouseName, int myAddress){
		houseName = myHouseName;
		address = myAddress;
	}
	
	//default constructor
	public House(){
		
	}
	
	//methods
	void kitchen() {
		System.out.println("miam miam eat the whole day");
	}
	
	public void room() {
		System.out.println("sleep zzzzzzzzzzzzzzzzzzzzzz");
	}
	
	void bathRoom() {
		System.out.println("shower shower lalalalalala");
	}

}
