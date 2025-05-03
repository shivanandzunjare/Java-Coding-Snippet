package pkg3;

//object cloning
public class Person implements Cloneable {
	String name;
	int age;
	
	Person (String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();  // Shallow copy
    }
	
	void display() {
        System.out.println(name + " - " + age);
    }

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Person p1 = new Person("Alice", 25);
        Person p2 = p1.clone();  // Clone the object

        p1.display();
        p2.display();
	}

}
