package pkg2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println(" enter the number to check wheather it is armstrong or not ");
		int n = in.nextInt();
		int temp, remainder, sum = 0,   digit=0;
		
		temp = n ;
		while ( temp != 0) {
			digit++;
			temp = temp / 10;
		}
		temp = n;
		while ( temp != 0) {
			remainder = temp % 10;
			sum = sum + power(remainder, digit);
			temp = temp / 10;
		}
		
		if ( n == sum )
			System.out.println(n +" it is an armstrong number");
		else 
			System.out.println(n +" it is not an armstrong number");
		
	}
	static int power(int remainder, int digit) {
		int p = 1;
		for( int c =1; c<=digit; c++) {
			p = p * remainder;
		}
		return p;
	}

}