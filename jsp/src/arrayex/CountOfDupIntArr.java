package arrayex;

public class CountOfDupIntArr {

	public static void main(String[] args) {
		int a[]= {12,43,43,56,13,22,12};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		System.out.println("The count of duplicate int array "+count);
	}

}
