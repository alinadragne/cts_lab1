package ro.ase.cts.seminar10.command;

public class DimLightCommand implements CommandInterface{
	
	private LighBulb bulb;
	
	public DimLightCommand(LighBulb bulb) {
		super();
		this.bulb = bulb;
	}


	@Override
	public void execute() {
		bulb.dimLight();
		
	}

}
