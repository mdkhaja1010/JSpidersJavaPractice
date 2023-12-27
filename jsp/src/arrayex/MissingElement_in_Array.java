package arrayex;

public class MissingElement_in_Array {

	public static void main(String[] args) {
		int a[] = {10,11,12,13,14,15,17 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
		int sum1 = 0;
		for (int i = 10; i <= 17; i++) {
			sum1 = sum1 + i;

		}
		System.out.println(sum1);
		System.out.println("missing elements are " + (sum1 - sum));

	}

}
