package pkg2;

public class ConcatenateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Java programming ";
		
		int length = s.length();
		System.out.println("number of characters in string =" + length);
		
		String r = s.replace("Java", "C++");
		System.out.println(s);
		System.out.println(r);
		
		String c = r.concat("is fun");
		System.out.println(r);
		System.out.println(c);
		
	}

}