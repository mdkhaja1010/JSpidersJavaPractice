package constructorex;
public class Student{
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	static String clgName="SVH COLLEGE OF ENGG";
	String name;
	int roll;
	public void display() {
		System.out.println("Student college name: " +Student.clgName);
		System.out.println("student name: " +this.name + " , " + " Student roll: "+ this.roll);
	}
}