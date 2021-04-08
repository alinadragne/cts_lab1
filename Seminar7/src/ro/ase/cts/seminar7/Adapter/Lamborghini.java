package ro.ase.cts.seminar7.Adapter;

public class Lamborghini extends EuropeanCar {

	public Lamborghini(String model) {
		super(model);
	}

	@Override
	public int getMaxSpeed() {
		//metric system
		return 320;
	}

}
