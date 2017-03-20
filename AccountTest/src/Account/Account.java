package Account;

import java.util.Scanner;

public class Account {
		
	private float total;
	
	public void credit(float money) {
		total += money;
	}
	
	public void debit(float money) {
		total -= money;
		if (total < 0) {
			total += money;
			System.out.print("ban\n");
		}
	}
	
	
	public float balance() {
		return total;
	}
}
	
	