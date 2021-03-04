package ro.ase.cts.seminar2;

public class CurrentAccount extends BankAccount{
	
	public static double MAX_CREDIT=2500;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
	}

	@Override
	public void deposit(double amount) {
		this.setBalance(getBalance() + amount);
		//this.balance+=amount
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(double amount, Account destination) {
		// TODO Auto-generated method stub
		
	}

}
