package ro.ase.cts.seminar11.exemplu;

public class Main {

	public static void main(String[] args) {
		Banca banca = Banca.getInstance("BCR", "Romana");
		System.out.println(Banca.NRCONTURI);
		
		ContBancar contBancar1 = banca.createInstance("CREDIT");
		System.out.println(Banca.NRCONTURI);
		
		ContBancar contBancar2 = banca.createInstance("DEBIT");
		System.out.println(Banca.NRCONTURI);
		
		ContBancarInterface cont = new AdapterCont();
		
		ContBancar adapterCont = new AdapterCont();
		System.out.println(adapterCont);
		
		adapterCont.transfer(contBancar1, 20);
		System.out.println(adapterCont);
		
		adapterCont.depune(30);
		System.out.println(adapterCont);
		((ContBancarInterface) adapterCont).accountTrasfer(cont, 200);
		System.out.println(adapterCont);

		
		
	}

}
