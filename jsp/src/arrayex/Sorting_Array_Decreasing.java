package arrayex;

public class Sorting_Array_Decreasing {

	public static void main(String[] args) {
		int a[]= {20,70,40,10,50,30,60};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("[");
		for(int k=0;k<a.length;k++) {
			System.out.print(" "+a[k]);
			
		}
		System.out.println("]");

	}

}
