package pkg3;

public interface MyInterface {
	
	default void greet() {
        System.out.println("Hello from interface! default method");
    }
	
	  static void staticM() {
	        System.out.println("Static method in interface.");
	    }

}
