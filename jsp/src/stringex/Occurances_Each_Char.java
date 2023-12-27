package stringex;

public class Occurances_Each_Char {

	public static void main(String[] args) {
		String name="java";
		String na="dev";
		String s = name.concat(na);
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			boolean found = false;
			for (int j = 0; j < s1.length(); j++) {
				if (s.charAt(i) == s1.charAt(j)) {
					found = true;
					break;
				}
			}
			if (found == false) {
				s1 = s1.concat(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println(s1);
		for (int i = 0; i < s1.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s1.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			System.out.println(s1.charAt(i) + " occurances " + count);
		}

	}

}
