package exceptionex;

public class P1 {

	public static void main(String[] args) {
		int a=13;
		int b=0;
		try {
		int c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println("arithematic exception occur");
			
		}
		int n=10;
		int n1=12;
		int n2=n+n1;
		System.out.println(n2);
	}

}
