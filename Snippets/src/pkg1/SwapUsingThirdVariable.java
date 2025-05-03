package pkg1;
import java.util.Scanner;

public class SwapUsingThirdVariable {

	public static void main( String [] args) {
		int num1, num2, temp;
		
		System.out.println(" enter  two numbers" );
		Scanner in = new Scanner(System.in);
		
		num1 = in.nextInt();
		num2 = in.nextInt();
		
		System.out.println(" before swapping num1 = " + num1 + "  &   num2 =  " + num2) ;
		temp = num2;
		num2 = num1;
		num1 = temp;
		
		System.out.println(" after swapping num1 = " + num1 + "  &   num2 =  " + num2) ;
	}
}
