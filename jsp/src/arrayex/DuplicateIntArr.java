package arrayex;

public class DuplicateIntArr {

	public static void main(String[] args) {
		int a[] = { 12, 34, 54, 34, 12, 57, 46 };
		boolean found = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("the duplicate integers are: " + a[i]);
					found = true;
					break;
				}
			}
		}
		if (found == false) {
			System.out.println("there is no duplicate values");
		}

	}

}
