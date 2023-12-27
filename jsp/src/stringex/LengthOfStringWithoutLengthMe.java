package stringex;

public class LengthOfStringWithoutLengthMe {

	public static void main(String[] args) {
		int count=0;
		String s="mahabharath";
		String[]ch=s.split("");
		for(String ch1: ch) {
			count++;
		}
		System.out.println(count);
	}

}
