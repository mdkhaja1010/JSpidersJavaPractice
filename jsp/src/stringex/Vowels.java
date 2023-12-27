package stringex;

public class Vowels {

	public static void main(String[] args) {
		String name="apple";
        int count=0;
        for(int i=0;i<name.length();i++) {
       	 char ch=name.charAt(i);
       	 switch (ch){
       	 case 'a':
       	 case 'A':
       	 case 'e':
       	 case 'E':
       	 case 'o':
       	 case 'O':
       	 case 'i':
       	 case 'I':
       	 case 'u':
       	 case 'U':
       		 count++;
       		 
       	 
       	 }
        }
        System.out.println("the vowels present in given string is "+count);
	 }
}	 

	


