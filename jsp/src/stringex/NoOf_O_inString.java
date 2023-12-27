package stringex;

public class NoOf_O_inString {

	public static void main(String[] args) {
		String name="hello how are  you";
		char ch='o';
		int count=1;
	    for(int i=0;i<name.length();i++) {
	    	if(name.charAt(i)==ch && name.charAt(i+1)!=' ') {
	    		count++;
	    	}
	    }
	    System.out.println("the no of o present in a given String is "+count);

	}

}
