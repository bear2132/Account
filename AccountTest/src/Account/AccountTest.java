package Account;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account();
		
		System.out.printf("account1 balance: $%f\n", account1.balance());
		System.out.printf("account2 balance: $%f\n", account2.balance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter add money to the account1 : ");
		
		int number1 = input.nextInt();
		account1.credit(number1);
		
		System.out.print("Enter add money to the accoutn2 : ");
		
		int number2 = input.nextInt();
		account2.credit(number2);
		
		System.out.printf("account1 balance : $%f\n", account1.balance());
		System.out.printf("account2 balance : $%f\n", account2.balance());
		
		System.out.print("Enter withdrawal1 amount for account1 : ");
		int number3 = input.nextInt();
		account1.debit(number3);
		
		System.out.printf("account1 balance : $%f\n", account1.balance());
		System.out.printf("account2 balance : $%f\n", account2.balance());
		
	}
}