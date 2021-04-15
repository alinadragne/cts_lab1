package ro.acs.cts.seminar8.decorator;

public class WithFoodDecorator extends AbstractBackpackDecorator{

	String food;
	
	public WithFoodDecorator(AbstractBackpack basicBackpack) {
		super(basicBackpack);
	}

	public WithFoodDecorator(AbstractBackpack basicBackpack, String food) {
		super(basicBackpack);
		this.food = food;
	}
	@Override
	public void pack() {
		this.basicBackpack.pack();
		System.out.println(" + " + this.food);
		
	}
	
	public String getFood() {
		return this.food;
	}

}
