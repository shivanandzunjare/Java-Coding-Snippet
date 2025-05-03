package starpattern;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for( int r=1; r<=6; r++) {
			for (int s=1; s<=r; s++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
