package arrayex;


import java.util.Arrays;

public class SortingIncreasing {

	public static void main(String[] args) {
		int a[]= {19,15,12,8,17};
		System.out.print("{");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {	
			System.out.print( " "+a[i]);
			
		}
		System.out.println("}");
	}

}
