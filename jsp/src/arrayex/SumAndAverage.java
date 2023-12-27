package arrayex;

public class SumAndAverage {

	public static void main(String[] args) {
		int sum=0;
		int a[]= {10,12,13,14,15};
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
       System.out.println("the sum of given array is "+sum);
       float average;
       average=sum/a.length;
       System.out.println("the average of an given array is "+average);
	}

}
