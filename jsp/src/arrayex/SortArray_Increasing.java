package arrayex;

public class SortArray_Increasing {

	public static void main(String[] args) {
		int a[]= {60,10,20,50,40,30};
	    for(int i=0;i<a.length;i++) {
	    	for(int j=i+1;j<a.length;j++) {
	    		if(a[i]>a[j]) {
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
