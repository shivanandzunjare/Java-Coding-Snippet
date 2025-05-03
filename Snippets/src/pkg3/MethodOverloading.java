package pkg3;

public class MethodOverloading {
	public  int sum(int a, int b) {
		return a + b;
	}
	
	public  int  sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.sum(11, 22, 10));

	}

}
