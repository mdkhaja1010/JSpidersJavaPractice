package stringex;

import java.util.Scanner;
public class Reverse_String_Each_word {
	public static void main(String[] args) {
	String str="welcome to java and selenium";
	String word[]=str.split(" ");
	String reverseString="";
	for(String w:word) {
		String reversewords="";
		for(int i=0;i<w.length();i++) {
			reversewords=w.charAt(i)+reversewords;
		}
		reverseString=reverseString+reversewords+" ";
	}
	System.out.println(reverseString);
	String sub="";
	for(int i=0;i<reverseString.length();i++) {
		if(reverseString.charAt(i)!=' ') {
		sub=reverseString.charAt(i)+sub;
		}
	}
	System.out.println(sub);
	
	  
	}
}
