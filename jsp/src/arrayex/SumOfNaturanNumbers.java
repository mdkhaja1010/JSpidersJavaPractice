package arrayex;
import java.util.*;
public class SumOfNaturanNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter the Array  size");
		int size=sc.nextInt();
		int a[]=new int[size];
	
		for(int i=0;i<size;i++) {
			 a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=-0;i<size;i++) {
			//System.out.print(" "+a[i]);
			sum=sum+a[i];
		}
		System.out.println("the sum of the given array is number is "+sum);
		
	}

}
