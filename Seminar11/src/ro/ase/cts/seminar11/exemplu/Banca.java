package ro.ase.cts.seminar11.exemplu;

import java.util.HashMap;

public class Banca {

	private String denumire;
	private String adresa;
	public static int NRCONTURI = 0;
	
	private static Banca INSTANCE = null;
	
	
	
	public Banca(String denumire, String adresa) {
		super();
		this.denumire = denumire;
		this.adresa = adresa;
	}



	public static synchronized Banca getInstance(String denumire, String adresa) {
		if(INSTANCE == null) {
			INSTANCE = new Banca(denumire, adresa);
		}
		
		return INSTANCE;
	}
	
	public ContBancar createInstance(String tipCont) {
		ContBancar contBancar;
		
		switch(tipCont) {
		case "CREDIT":
			contBancar = new ContCredit();
			NRCONTURI++;
			break;
		case "DEBIT":
			contBancar = new ContDebit();
			NRCONTURI++;
		default:
			contBancar = null;
			
		}
		return contBancar;
	}
}
