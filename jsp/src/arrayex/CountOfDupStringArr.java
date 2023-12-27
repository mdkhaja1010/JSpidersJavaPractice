package arrayex;

public class CountOfDupStringArr {

	public static void main(String[] args) {
		String arr[] = { "java", "c", "c++", "python", "java", "c" ,"c++"};
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}

			}

		}
		System.out.println(count);
	}

}
