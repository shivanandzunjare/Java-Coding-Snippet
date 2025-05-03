package pkg3;

public class TestThrow {
	
	static void validate(int age ) {
		if ( age  < 18 )
			System.out.println("not eliglible");
		else 
			System.out.println("welcome and come to vote ");
	}

	public static void main(DemoString[] args) {
		// TODO Auto-generated method stub
		validate(20);
		System.out.println(" rest of code ");
	}
}
