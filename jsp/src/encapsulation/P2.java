package encapsulation;

public class P2 {

	public static void main(String[] args) {
		System.out.println("from P1");
		P1 obj=new P1(11,24,54 );
		obj.display();
		obj.setHr(12);
		obj.setMin(35);
		obj.setSec(43);
		System.out.println(obj.getHr());
		System.out.println(obj.getMin());
		System.out.println(obj.getSec());
		obj.display();

	}

}
