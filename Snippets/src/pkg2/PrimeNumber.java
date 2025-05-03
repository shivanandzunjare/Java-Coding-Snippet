package pkg2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int num = 3, n, status = 1;
		
		System.out.println(" enter the prime numbers you want");
		n = in.nextInt();
		
		if( n >= 1) {
			System.out.println("first " + n + "  prime number are ---->");
			System.out.println(2);
		}
		
		for ( int count=2; count<= n;) {
			for ( int j=2; j<=Math.sqrt(num); j++ ) {
				
				if(num % j ==0) {
					status = 0;
					break;
				}
			}
			if( status != 0) {
				System.out.println(num);
				count++;
			}
			
			status = 1; 
			num++;
		}
		
		in.close();

	}
}
