package pkg2;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number to check it palindrome or not");
		int num ;
		num = sc.nextInt();
		int reverserNum = 0;
		//   / --> quotient
		//    % --> remainder12
		 int temp = num;
		 
		 while( num != 0) {
			 reverserNum = reverserNum * 10 + num % 10; 
			 num = num / 10;
		 }
		 if (temp == reverserNum) {
			 System.out.println(" this is palindrome");
		 }
		 else
			 System.out.println( reverserNum +" not an palindrome");
	}
}