package castingex;

public class UserLogic {
	public static void main(String[] args) {
		System.out.println("hellow world");
		P1 obj=new P1();
		obj.run();
		P1 obj1= new P2();
		P2 obj2=(P2)(new P1());
		obj2.walk();
		
	}

}
