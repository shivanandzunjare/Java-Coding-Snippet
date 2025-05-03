
package pkg2;


public class DiffStaticInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMeth();
		DiffStaticInstance obj = new DiffStaticInstance();
		obj.display();
	}
	
	static void staticMeth() {
		System.out.println(" this is static methods");
	}
	
	void display() {
		System.out.println(" this is instance methods ");
		
	}
}