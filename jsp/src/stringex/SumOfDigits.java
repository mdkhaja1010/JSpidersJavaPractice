package stringex;

public class SumOfDigits {

	public static void main(String[] args) {
		String name = "54khaja7";
		int sum = 1;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum*=(ch-'0');
			}
		}
		System.out.println("the sum of digits in given String is " + sum);

	}

}
