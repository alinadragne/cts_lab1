package ro.ase.cts.seminar10.command;

public class IncreaseLightOnCommand implements CommandInterface{
	private LighBulb bulb;
	
	
	public IncreaseLightOnCommand(LighBulb bulb) {
		super();
		this.bulb = bulb;
	}


	@Override
	public void execute() {
		bulb.increaseLightIntensity();
		
	}
}
