package method_overloading;

public class Method_Overloading {

	public static int eat(int a ,int b) {
		return a+b;
	}
	public static int eat(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println("Ececution started");
		System.out.println(eat(5,8));
		System.out.println(eat(2,3,6));
	}

}
