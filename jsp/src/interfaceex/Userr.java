package interfaceex;

public class Userr {
	public static void main(String[] args) {
		Bank b=new Bank();
		Atm atm=b.atm();
		atm.withdral();
		atm.deposit();
	    atm.balanceEn();
		
		
	}

}
