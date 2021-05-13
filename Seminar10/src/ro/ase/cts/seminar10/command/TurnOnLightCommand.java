package ro.ase.cts.seminar10.command;

public class TurnOnLightCommand implements CommandInterface{

	private LighBulb bulb;
	
	
	public TurnOnLightCommand() {
		super();
		this.bulb = bulb;
	}


	@Override
	public void execute() {
		bulb.turnOnLight();
		
	}

}
