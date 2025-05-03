package stringSnipet_01;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "Guys";
		System.out.println(" before swap a -> " + a + " and b -> " + b);
		
		a = a + b;
		
		b = a.substring(0, a.length() - b.length());  // b = Hello
		
		a = a.substring(b.length()) ; // a = Guys
		
		System.out.println(" after swap a -> " + a + " and b-> " + b);

	}

}
