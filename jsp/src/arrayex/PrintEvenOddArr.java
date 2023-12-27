package arrayex;

public class PrintEvenOddArr {

	public static void main(String[] args) {
		int a[]= {10,23,45,68,46,13};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
