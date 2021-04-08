package ro.ase.cts.seminar7.Adapter;

public class AmericanCar implements MoveableImperial{

	private String model;
	
	public AmericanCar(String model) {
		super();
		this.model = model;
	}

	@Override
	public int getMaxSpeed() {
		//imperial system
		return 200;
	}

}
