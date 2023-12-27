package arrayex;

public class Lowest_NumberArray {

	public static void main(String[] args) {
		int a[]= {3,5,1,-9,7,8,6,7,9};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			//System.out.println();
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println(min);

	}

}
