package stringex;
import java.util.*;

public class StringVowels_consonents {

	public static void main(String[] args) {
		int vowels=0;
		int consonents=0;
		 Scanner sc= new Scanner(System.in) ;
		// String s=sc.nextLine();
		 System.out.println("Enter the String ");
		 String s=sc.nextLine();
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u' ) {
				 vowels++;
			 }
			 else {
				 consonents++;
			 }
		 }
			System.out.println("vowels is "+vowels); 
		     System.out.println("consonents is "+consonents);

	}

}
