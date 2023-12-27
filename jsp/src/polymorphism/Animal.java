package polymorphism;

public class Animal {

	public void talk() {
		 System.out.println("animal talks");
	
	}
}
class Cat extends Animal{
	public void talk() {
		 System.out.println("meow");
	}
}
