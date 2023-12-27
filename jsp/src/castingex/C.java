package castingex;

public class C {

	public static void main(String[] args) {
		A obj =new B();
		System.out.println(obj.i);
		//System.out.println(obj.j);
		//B obj2=(B)( new A());
		//System.out.println(obj2.j);
		A obj1=new A();
		System.out.println(obj1.i);
		System.out.println(obj.toString());
		

	}

}
