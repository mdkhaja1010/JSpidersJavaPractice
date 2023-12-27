package stringex;

public class Reverse_String {
	public static void main(String[] args) {
		String name="aha";
		String rev="";
		for(int i=0;i<name.length();i++) {
			rev=name.charAt(i)+rev;
			
		}
		if(name.equals(rev)) {
			System.out.println("the given string is  a palindrome "+rev);
		}
		else {
			System.out.println("the given string is not a palindrome "+rev);
		}
	}
}
		