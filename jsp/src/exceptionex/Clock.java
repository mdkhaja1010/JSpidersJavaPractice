package exceptionex;

public class Clock {
	public Clock(int hr, int min, int sec) {
		super();
		if((hr>=0 && hr<=12) && (min>=0 && min<=59) && (sec>=0 && sec<=59)) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
		}
		else {
			throw new TimeInCorrectException();
		}
			
	}
	
	private int hr;
	private int min;
	private int sec;
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		if(hr>=0 && hr<=12)
		this.hr = hr;
		else
			throw new TimeInCorrectException();
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if(min>=0 && min<=59)
		this.min = min;
		else
			throw new TimeInCorrectException();
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		if(sec>=0 && sec<=59)
		this.sec = sec;
		else
			throw new TimeInCorrectException();
		
	}
	public void display() {
		System.out.println(this.hr+" "+this.min+" "+this.sec);
		System.out.println("time show sucessful");
	}
}
