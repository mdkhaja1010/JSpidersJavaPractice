package inheritanceex;

public class Company {

	public static void main(String[] args) {
		System.out.println("hellow world");
		Employee e1=new Employee("karim","white","154C1",64.8);
		System.out.println(e1.name);
		System.out.println(e1.color);
		System.out.println(e1.eid);
		System.out.println(e1.sal);
		Employee e2 = new Employee("khaja","black","153C1",56.5);
		System.out.println(e2.name);
		System.out.println(e2.color);
		System.out.println(e2.eid);
		System.out.println(e2.sal);
		
	}

}
