package ro.ase.cts.seminar2;

public class Main {

	public static void main(String[] args) {
		CurrentAccount c=new CurrentAccount(300, "IBAN123");
		System.out.println("suma disponibila este:"+ c.getBalance());
		//System.out.println("Creditul maxim pentru contul curent este:" + CurrentAccount.MAX_CREDIT);
	}

}
