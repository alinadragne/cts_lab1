package ro.ase.cts.seminar10.command;


public class TurnOffLightCommand implements CommandInterface{

	private LighBulb bulb;
	
	
	public TurnOffLightCommand(LighBulb bulb) {
		super();
		this.bulb = bulb;
	}


	@Override
	public void execute() {
		bulb.turnOffLight();
		
	}

}
