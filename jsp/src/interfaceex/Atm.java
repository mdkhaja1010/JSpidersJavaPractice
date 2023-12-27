package interfaceex;

public interface Atm {
	public void withdral();
	public void deposit();
	public void balanceEn();
	

}
class Bank{
	private class SBI implements Atm{
		public void withdral() {
			System.out.println("Money withdrawl sucesss");
		}
		public void deposit() {
			System.out.println("money deposit sucess");
		}
		public void balanceEn() {
			System.out.println("BalanceEn sucess");
		}
		public Atm atm() {
			return new SBI();
		}
	}
}
