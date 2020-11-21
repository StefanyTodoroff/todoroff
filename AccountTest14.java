package stefany;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.setId(1122);
		acc.setBalance(20_000);
		acc.setYearInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		
		System.out.println("Balance: " + acc.getBalance() + "\nMonthly inerest: " + acc.getMonthlyInterest() + 
				"\nDate: " + acc.getDateCreated());
	}
}
