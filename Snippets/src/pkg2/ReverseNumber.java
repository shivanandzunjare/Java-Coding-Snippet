package pkg2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println(" enter a number");
		int n = in.nextInt();
		
		int r = 0;
		int temp = n;
		while ( n != 0) {
			r = r * 10 + n % 10;
			n = n / 10;
		}
		System.out.println(" reverse of entered is " + r);
		
		if ( temp == r ) {
			System.out.println( temp + " this number is palindrome");
		}

	}

}
