package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class SavingsAccount extends BankAccount{

	
	
	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(double balance, String iban) {
		super(balance, iban);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(amount <= this.balance) {
			this.balance -= amount;
		}
		
	}

	@Override
	public void transfer(double amount, Account destination)
			throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("Conturile coincid!!");
		}
		else {

		    this.withdraw(amount);
			destination.deposit(amount);
		}
	}

}
