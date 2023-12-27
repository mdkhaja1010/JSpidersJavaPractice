package accessspecifier;

public class User {

	public static void main(String[] args) {
	  A obj=new B();
	  System.out.println(obj.i);
      System.out.println(obj.j);
      obj.run();
      obj.walk();
      B obj1= new B();
      System.out.println(obj1.i);
      System.out.println(obj1.j);
      obj1.run();
      obj1.walk();
      A obj2= new A();
      System.out.println(obj2.i);
      System.out.println(obj2.j);
      obj2.run();
      obj2.walk();
      
	}

}
