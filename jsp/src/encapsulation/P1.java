package encapsulation;

public class P1 {
	private int hr;
	private int min;
	private int sec;
	public void setHr(int hr) {
		if(hr>=1&&hr<=12) {
			this.hr=hr;
		}
		else {
			System.out.println("enter time is correct");
		}
	}
	public int getHr() {
		return this.hr;
		
	}
	public void setMin(int min) {
		if(min>=0&&min<=60) {
			this.min=min;
			
		}
		else {
			System.out.println("enter time is incorrect");
		}
	}
	public int getMin() {
		return this.min;
	}
	public void setSec(int sec) {
		if(sec>=0&&sec<=60) {
			this.sec=sec;
		}
		else {
			System.out.println("enter time is incorrect");
		}
	}
	public int getSec() {
		return this.sec;
	}
	public P1(int hr,int min,int sec) {
		if((hr>=1&&hr<=12)&&(min>=0&&min<=60)&&(sec>=0&&sec<=60)) {
			this.hr=hr;
			this.min=min;
			this.sec=sec;
		}
		else {
			System.out.println("enter time is incorrect");
		}
	}
		public void display() {
			System.out.println(this.hr+ " " +this.min+ " " +this.sec);
		}
	}


