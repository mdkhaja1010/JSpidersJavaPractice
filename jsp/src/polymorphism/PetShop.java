package polymorphism;

public class PetShop {

	public static void main(String[] args) {
		 System.out.println("hellow world");
		 Animal animal=new Animal();
		 animal.talk();
		 System.out.println("&&&&&&");
		 Cat cat =new Cat();
		 cat.talk();
		 System.out.println("@@@@@");
		 Animal animal1=new Cat();
		 animal1.talk();

	}

}
