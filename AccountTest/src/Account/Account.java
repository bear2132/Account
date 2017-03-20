package Account;

public class Account {
	
	
	private double balance;
	
	public void credit(double money) {
		balance = money;
	}
	
	public void debit(double money) {
		balance = balance - money;
	}
	
	
	public void bal() {
		System.out.printf("$%f", balance);
	}
}
	
	