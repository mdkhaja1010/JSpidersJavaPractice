  package arrayex;

public class Int_PresentinArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int num=2;
		boolean found=false;
		for(int n:a) {
			if(n==num) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println(num+" is present in the given array");
		}
		else {
			System.out.println(num+" is not present in the given array");
		}
	}

}
