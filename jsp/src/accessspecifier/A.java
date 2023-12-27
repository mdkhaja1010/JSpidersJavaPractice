package accessspecifier;

public class A {
	static int i=10;
	int j=20;
	public static void run() {
		System.out.println("from run of A");
	}
	public void walk() {
		System.out.println("from walk of A");
	}

}
class B extends A{
	static int i=30;
	int j=40;
	public static void run() {
		System.out.println("from run of B");
	}
	public void walk() {
		System.out.println("from walk of B");
		
	}
}
