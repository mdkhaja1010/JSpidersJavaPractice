package stringex;

public class Removing_Vowels_String {

	public static void main(String[] args) {
		String s="kh6654344aja";
		String s1="";
		s1=s.replaceAll("[aeiou0-9]", "");
		System.out.println("After removing vowels in a given String "+s1);
		

	}

}
