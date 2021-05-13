package ro.ase.cts.seminar11.exemplu;

public class AdapterCont implements ContBancarInterface, ContBancar {

	private double total=500;
	@Override
	public void accountTrasfer(ContBancarInterface account, double amount) {
		this.transfer(this, amount);
		
	}

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		
		total+=suma;
		destinatie.depune(suma);
		System.out.println( suma + "de lei a fost adaugata in "+destinatie + "->cont Debit");
	}

	@Override
	public void depune(double suma) {
		total+=suma;
		System.out.println(suma +"de lei a fost adaugata in contul curent -> Debit");
		
	}

	@Override
	public String toString() {
		return "AdapterCont [total=" + total + "]";
	}
	
	
}
