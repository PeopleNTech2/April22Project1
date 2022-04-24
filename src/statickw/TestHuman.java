package statickw;

public class TestHuman {

	public static void main(String[] args) {
		//access non-static attributes: use the object
		Human human = new Human();
		human.person1();
		
		//access static attributes: use the class name only
		Human.person2();

	}

}
