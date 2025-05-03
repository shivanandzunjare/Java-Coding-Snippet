package pkg2;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, result;
		
		Scanner in = new Scanner(System.in);
		System.out.println(" enter two numbers" );
		a = in.nextInt(); 
		b = in.nextInt();
		
		try {
			result = a / b;
			System.out.println("result -->" + result);
		}
		
		catch (ArithmeticException e){
			System.out.println(" exception caught --> divide by zero");
			
		}
	}
}