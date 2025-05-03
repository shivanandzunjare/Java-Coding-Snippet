package pkg2;

public class ConstrOverloading {
	
	String name;
	
	public ConstrOverloading() {
		System.out.println(" constr method called ");
	}
	
	ConstrOverloading(String t){
		name = t;
	}
	void setName(String t) {
		name = t;
	}
	
	void getName() {
		System.out.println(" language name " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstrOverloading cpp = new ConstrOverloading();
		ConstrOverloading java = new ConstrOverloading("Java");
		
		cpp.setName("c++");
		cpp.getName();
		java.getName();
	
	}
}