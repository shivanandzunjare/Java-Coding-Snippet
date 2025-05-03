package starpattern;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println(" enter the number of rows for floyd triangle");
		int row = in.nextInt();
		int number = 1;
		
		for ( int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(number + " "); 
				number++;
			}
			System.out.println();
		}
	}

}