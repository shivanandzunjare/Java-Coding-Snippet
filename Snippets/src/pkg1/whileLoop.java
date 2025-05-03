package pkg1;
import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println(" input an integer");
		while( (n = in.nextInt() ) != 0) {
			System.out.println(" you entered an integer " + n);
			//System.out.println(" input an integer");
			break;
		}
		System.out.println(" out of loop");
	}
}