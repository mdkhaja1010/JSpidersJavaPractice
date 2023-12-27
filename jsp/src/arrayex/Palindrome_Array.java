package arrayex;

public class Palindrome_Array {
	public static void palindrome(int a[],int n) {
		int num=0;
		for(int i=0;i<n/2 && n!=0;i++) {
			if(a[i]!=a[n-i-1]) {
				num=1;
				break;
			}
		}
		if(num==1) {
			System.out.println("Array is not  palindrome");
		}
		else {
			System.out.println("Array is palindrome");
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,2,1};
		int n=a.length;
		palindrome(a,n);
		
	}

}
