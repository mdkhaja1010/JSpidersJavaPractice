package stringex;

public class Removing_Special_Char {

	public static void main(String[] args) {
		String s="kha!@#$%^&&*ja";
		String s1="";
		s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After removing vowels in a given String "+s1);

	}

}
