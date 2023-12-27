package arrayex;

public class Largest_Number3_4 {

	public static void main(String[] args) {
		int a[]= {20,50,10,30,40,60,80,90,70};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
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
		System.out.println("the third largest number is "+a[2]);
        System.out.println("the fourth largest number is "+a[3]);
	}

}
