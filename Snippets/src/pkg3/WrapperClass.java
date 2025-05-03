package pkg3;

public class WrapperClass {

	public static void main(String[] args) {
		
		
//		int a= 20;
//		Integer i = Integer.valueOf(a);
//		Integer j = a; // autoboxing
//		System.out.println(i + " " + j);
		
		
		Integer a = new Integer(3);
		 int i = a.intValue(); // unboxing
		 int j=a;
		 
		 System.out.println(i + " " + j );

	}

}
