package pkg1;
import java.util.Scanner;

public class FahreneitToCelsius {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int f, c;
		System.out.println(" enter the temprature in fahreneit ");
			f = in.nextInt();
			
		 c = (f - 32) * 5 / 9;
			
			System.out.println(" celsius temp is " + c);
		
	}
}
