package pkg2;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		System.out.println(" enter number for multiplication");
//		int n = in.nextInt();
//		
//		for ( int i=1; i<=10; i++) {
//			System.out.println( n +" * " + i + " = " + ( n * i) );
//		}
		
		//range of table 
		
		Scanner in = new Scanner(System.in);
		System.out.println(" enter range for multiplication");
		int a = in.nextInt();
		int b = in.nextInt();
		
		for ( int  c=a; c<=b; c++) {
			
			for ( int i=1; i<=10; i++) {
				System.out.println( c +" * " + i + " = " + ( c * i) );
			}
			System.out.println();
		}
	}

}
