package accessspecifier;

public class P2 {
	
	String clgName;
	int roll;
	int cell;
	
	public P2(String clgName,int roll,int cell) {
		this.clgName=clgName;
		this.roll=roll;
		this.cell=cell;
	}

	public void display() {
		System.out.println( "the college name "+ this.clgName);
		System.out.println("roll number: "+ this.roll);
		System.out.println("cell number: "+ this.cell);
	}
	public void walk() {
		System.out.println("college name" +this.clgName);
		System.out.println("roll number: "+ this.roll);
		System.out.println("cell number: "+ this.cell);
		
	}
}

	
