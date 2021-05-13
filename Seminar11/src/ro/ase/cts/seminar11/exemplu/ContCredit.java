package ro.ase.cts.seminar11.exemplu;

public class ContCredit implements ContBancar{
	
	private double total = 1000; 

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		total -= suma;
		destinatie.depune(suma);
		System.out.println(suma + " lei a fost adaugata in " + destinatie +" -> Debit");
	}

	@Override
	public void depune(double suma) {
		total += suma;
		System.out.println(suma + " lei  a fost adaugata -> Debit");
		
	}

}
