package ro.ase.cts.seminar10.command;

public class TurnLightOnCommand implements CommandInterface{

	private LighBulb bulb;
	
	
	public TurnLightOnCommand(LighBulb bulb) {
		super();
		this.bulb = bulb;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
