package stringex;

public class Numbers_in_String {
	public static void main(String[] args) {
		String name="34mangoes2";
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch>'0'&&ch<'9') {
				count++;
			}
		}
		System.out.println("the given string contains digits is "+count);
		
	}

}
