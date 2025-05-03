package pkg2;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		String str = "" , reverses = "";
		System.out.println(" enter the string to check weather it is palindrome or not ");
		str = in.nextLine();
		int length = str.length();
		
		for ( int i=length-1 ; i>=0; i--) {
			reverses = reverses + str.charAt(i);
		}
		
		System.out.println(" reverse string is  " + reverses);
		if(str.equals(reverses))
			System.out.println(str +" is a palindrome ");
		else 
			System.out.println(str +" is not  a palindrome ");


	}

}
