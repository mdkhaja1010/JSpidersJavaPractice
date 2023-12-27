package stringex;

public class StringLengthEachWord {

	public static void main(String[] args) {
		String s="hello world my name is java";
		s=s+" ";
		int start=0;
		for(int i=0;i<s.length();i++) {
		   char ch=s.charAt(i);
		   if(ch==' ') {
			   String word=s.substring(start, i);
			   System.out.println(word+" - "+word.length());
			   start=i+1;
		   }
				   
		}

	}

}
