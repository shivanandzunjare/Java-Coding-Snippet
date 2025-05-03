package pkg3;

public class Dog extends Animal{
	
		@Override
		public void sound() {
		  System.out.println(" barks");
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a =  new Animal();
		a.sound();
		
		Dog d = new Dog();
		d.sound();
		
		Animal aa= new Dog();
		aa.sound();
//		
//		if(a instanceof Dog) {
//			Dog d = (Dog )a;
//			d.sound();
//		}

	}

}
