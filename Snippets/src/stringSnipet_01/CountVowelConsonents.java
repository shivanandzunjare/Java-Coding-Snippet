package stringSnipet_01;

public class CountVowelConsonents {
	
	public static void vowelConso(String str) {
		String  vowels = "aeiouAEIOU";
		int vowel = 0, consonents = 0;
	//	str = str.toLowerCase();
		for( char c : str.toCharArray()) {
			if( c>='a' && c<='z' || c>='A' && c <='Z') {
				if(vowels.indexOf(c) != -1) {
					vowel++;
					
				}else {
					consonents++;
				}
			}
		}
		System.out.println("vowel are " + vowel);
		System.out.println("consonents are " + consonents);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowelConso("HEllo world");
	}

}
