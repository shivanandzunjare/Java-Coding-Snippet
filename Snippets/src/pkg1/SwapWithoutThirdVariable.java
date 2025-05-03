package pkg1;
import java.util.Scanner;

public class SwapWithoutThirdVariable {
	
	public static void main ( String [] args) 
	{
		int x, y;
		System.out.println(" enter x & y");
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println(" before swapping x = " + x + " & y = " + y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		
		System.out.println(" after swapping \nx = " + x + " & \ny = " + y);
	}
}
