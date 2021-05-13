package ro.ase.cts.seminar11.exemplu;

public interface ContBancar {

	public void transfer(ContBancar destinatie, double suma);
	public void depune(double suma);
	
}
