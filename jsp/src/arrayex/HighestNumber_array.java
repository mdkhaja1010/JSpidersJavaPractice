package arrayex;

public class HighestNumber_array {

	public static void main(String[] args) {
		int a[] = { 3, 5, 1, -9, 7, 8, 6, 7, 9 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {

				max = a[i];

			}
		}

		System.out.println(max);

	}

}
