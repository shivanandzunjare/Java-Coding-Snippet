package pkg2;

public class EnhanceLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primes [] = {2,3,5,7,11,13,17,19};
		int num [] = new int[3];
		
		for (int t : primes) {
			System.out.print(t);
		}
		
		System.out.println("------------------");
		for ( int n : num) {
			System.out.println(n);
		}
	}
}