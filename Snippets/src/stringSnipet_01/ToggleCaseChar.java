package stringSnipet_01;

public class ToggleCaseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "JaVa";
		StringBuilder result = new StringBuilder();
		
		for ( char ch : input.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				result.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
			} else {
				result.append(ch);
			}
		}
		System.out.println(" after toggled -->" + result.toString());

	}

}
