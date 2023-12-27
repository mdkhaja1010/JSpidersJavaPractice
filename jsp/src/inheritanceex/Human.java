package inheritanceex;

public class Human {
	String name;
	String color;
	public Human(String name,String color) {
		this.name=name;
		this.color=color;
	}

}
class Employee extends Human{
	String eid;
	double sal;
	Employee(String name,String color,String eid,double sal){
		super(name,color);
		this.eid=eid;
		this.sal=sal;
	}
}
