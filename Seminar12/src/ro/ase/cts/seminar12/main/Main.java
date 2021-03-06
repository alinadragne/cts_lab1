package ro.ase.cts.seminar12.main;

import java.util.ArrayList;

import ro.acs.cts.seminar12.template.DecimalFormatter;
import ro.acs.cts.seminar12.template.HexFormatter;
import ro.ase.cts.seminar12.memento.CharacterMemento;
import ro.ase.cts.seminar12.memento.GameCharacter;
import ro.ase.cts.seminar12.observer.BankAccount;
import ro.ase.cts.seminar12.observer.CreditAccount;
import ro.ase.cts.seminar12.observer.InsufficientFundsException;
import ro.ase.cts.seminar12.observer.NotificationInterface;
import ro.ase.cts.seminar12.observer.SMSNotification;

public class Main {

	public static void main(String[] args) {
		CreditAccount account = new CreditAccount(1000, "IBAN00000");
		account.addObserver(new NotificationInterface() {
			
			@Override
			public void notifyUser(double amount) {
				System.out.println("{Inline example}: "+amount+" extracted.");
				
			}
		});
	
		
		
		NotificationInterface smsNotificationInterface = new SMSNotification();
		account.addObserver(smsNotificationInterface);
		
		try {
		account.withdraw(100);
		}
	catch(InsufficientFundsException e) {
		System.out.println(e.toString());
		}
		
		System.out.println("------------------------------------");
		ArrayList<CharacterMemento> saveList= new ArrayList<CharacterMemento>();
		GameCharacter myCharacter = new GameCharacter("Alina", 100);
		saveList.add(myCharacter.generateMemento());
		myCharacter.bleed();
		System.out.println("Character hitpoint: " + myCharacter.getHitpoints());
		myCharacter.setMemento(saveList.get(0));
		System.out.println("Character hitpoint: " + myCharacter.getHitpoints());
		
		System.out.println("---------------------------------------------------------");
		DecimalFormatter decimalFormatter = new DecimalFormatter();
		decimalFormatter.displayOutput(10);
		HexFormatter hexFormatter = new HexFormatter();
		hexFormatter.displayOutput(10);
	}
}
