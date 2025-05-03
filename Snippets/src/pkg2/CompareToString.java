package pkg2;

public class CompareToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="My name is Rajendra. My name is lamror. My name is Technolamror.";
        String [] words = s1.split("\\s");
        
        for (String w : words) {
        	System.out.println(w);
        }



	}

}
