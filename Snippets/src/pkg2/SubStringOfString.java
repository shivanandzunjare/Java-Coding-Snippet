package pkg2;

import java.util.Scanner;

public class SubStringOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		String sub;
		
		Scanner in = new Scanner(System.in);
		System.out.println(" enter the string");

		String str= in.nextLine();
		length = str.length();
		
		System.out.println(" substring of a " + str + " are -->");
		
		for ( int c = 0; c <= length - 1; c++) {
			for( int i = 1; i<=length-c; i++) {
				sub = str.substring(c, c+i);
				System.out.println(sub);
			}
		}
	}

}
