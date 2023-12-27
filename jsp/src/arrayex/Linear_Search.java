package arrayex;

public class Linear_Search {

	public static void main(String[] args) {
		int a[]= {1,9,3,6,2,5,4,8};
		int ele=4;
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			if(ele==a[i]) {
				System.out.println("the given element position is "+i);
				found=true;
				break;
			}
		}
		if(found==false) {
			System.out.println("the given element position is not found");
		}
	}

}
