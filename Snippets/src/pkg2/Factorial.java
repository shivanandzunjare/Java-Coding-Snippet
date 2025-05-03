package pkg2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,  f=1;
		System.out.println(" enter a num to find factorial");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for ( int i=1; i<=n ; i++) {
			f = f * i;
		}
		System.out.println(" factorial of " + n + "! is " + f );
	}

}
