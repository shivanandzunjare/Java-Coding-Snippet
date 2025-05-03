package stringSnipet_01;

public class ReplaceCharOccuranceAsNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Database";
		 StringBuilder result = new StringBuilder();
		 char target = 'a';
		 int count = 0;
		 
		 for ( char ch : str.toCharArray()) {
			 if ( ch == target) {
				 count++;
				 result.append((char)('0' + count));  // 1, 2, -- N
				
			 } else {
				 result.append(ch);
			 }
		 }
		 
		 System.out.println(result.toString());
		
				 
	}

}
