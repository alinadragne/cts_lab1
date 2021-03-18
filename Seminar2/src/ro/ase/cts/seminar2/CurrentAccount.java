package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.NotificationService;
import ro.ase.cts.seminar2.interfaces.Profitable;
import ro.ase.cts.seminar2.interfaces.Transferable;
import ro.ase.cts.seminar2.interfaces.Withdrawable;

public class CurrentAccount extends BankAccount  implements Depositable, Withdrawable, Transferable{
	
	public static double MAX_CREDIT=2500;
	public NotificationService notificationService;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
	}
	
	

	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@Override
	public void deposit(double amount) {
		this.setBalance(getBalance() + amount);
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException  {
		if(getBalance() >= amount) {
			this.setBalance(getBalance() - amount);
		}
		else {
				throw new InsufficientFundsException("Fonduri insuficiente!!");
		}
		if(this.notificationService != null) {
			this.notificationService.sendNotification("S-a extras suma " + amount);
		}
	}

	@Override
	public void transfer(double amount,  Depositable destination) throws IllegalTransferException,InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("Conturile coincid!!");
		}
		else {

		    this.withdraw(amount);
			destination.deposit(amount);
		}
		
	}
	
}
