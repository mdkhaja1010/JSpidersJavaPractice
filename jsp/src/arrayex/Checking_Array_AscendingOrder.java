package arrayex;

public class Checking_Array_AscendingOrder {
	public static int checkingArrayAscending(int a[], int n) {
		if(n==1||n==0) 
			return 1;
		if(a[n-1]<a[n-2])
			return 0;
		return checkingArrayAscending(a,n-1);
		
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int n=a.length;
		if(checkingArrayAscending(a,n)!=0) {
			System.out.println("the arrays is ascending order");
		}
		else {
			System.out.println("the array is not ascending order");
		}
	}

}
