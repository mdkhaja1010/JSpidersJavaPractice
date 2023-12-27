
package arrayex;

public class Reverse_Array {

	public static void main(String[] args) {
		int a[]= {20,10,50,30,10,60};
		System.out.print("[");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(" "+a[i]);
		}
          System.out.println("]");
	}

}
