package stringSnipet_01;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "  hello world  ";

	        // Use regex to replace all whitespace characters
	        String result = input.replaceAll("\\s+", "");

	        System.out.println("Output: " + result);

	}

}
