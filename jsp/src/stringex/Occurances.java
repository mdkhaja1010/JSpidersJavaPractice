package stringex;

public class Occurances {

	public static void main(String[] args) {
		String name="java";
		String na="dev";
		String s=name.concat(na);
		String rev=" ";
		
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<rev.length();j++) {
				if(s.charAt(i)==rev.charAt(j)) {
					count++;
				}
			}
			System.out.println(count);
			
		}
		

	}

}
