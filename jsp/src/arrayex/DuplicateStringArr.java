package arrayex;

public class DuplicateStringArr {

	public static void main(String[] args) {
		String[]a= {"java","c","python","c++","java","c"};
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("found duplicate elements "+a[i]);
					found=true;
					break;
				}
			}
		}
		if(found==false) {
			 System.out.println("not found duplicate elements");
		}

	}

}
