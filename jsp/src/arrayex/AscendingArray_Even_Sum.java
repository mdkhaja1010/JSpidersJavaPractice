package arrayex;

public class AscendingArray_Even_Sum {

	public static void main(String[] args) {
		int a[] = { 21, 50, 10, 30, 43, 60, 80, 97, 70 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("[");
		int sum = 0;
		for (int k = 0; k < a.length; k++) {
			if (a[k] % 2 == 0) {
				System.out.print(" " + a[k]);
				sum = sum + a[k];
			}

		}
		System.out.println("]");
		System.out.println("The sum of even numbers in given array is " + sum);

	}

}
