package ro.ase.cts.seminar10.main;

import java.awt.peer.LightweightPeer;

import ro.ase.acs.semina10.chain.AbstractLogger;
import ro.ase.acs.semina10.chain.LoggerChainFactory;
import ro.ase.acs.semina10.chain.Verbosity;
import ro.ase.cts.seminar10.command.CommandInterface;
import ro.ase.cts.seminar10.command.DimLightCommand;
import ro.ase.cts.seminar10.command.IncreaseLightOnCommand;
import ro.ase.cts.seminar10.command.LighBulb;
import ro.ase.cts.seminar10.command.RemoteControll;
import ro.ase.cts.seminar10.command.TurnLightOnCommand;
import ro.ase.cts.seminar10.command.TurnOffLightCommand;
import ro.ase.cts.seminar10.strategy.MarketingStrategyInterface;
import ro.ase.cts.seminar10.strategy.ModulMarketing;
import ro.ase.cts.seminar10.strategy.RandomMarketingStrategy;

public class Main {

	public static void main(String[] args) {
		ModulMarketing modulMarketing = new ModulMarketing();
		modulMarketing.setCurrentStrategy(new RandomMarketingStrategy());
		double puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: "+ puncteBonus);
		
		modulMarketing.setCurrentStrategy(new MarketingStrategyInterface() {
			
			@Override
			public double calculateBonus(double base) {
				return 30 * base;
			}
		});
		
		puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: "+ puncteBonus);
		
		modulMarketing.setCurrentStrategy((base) -> { return 20 * base; });
		
		puncteBonus = modulMarketing.getBonus(100);
		System.out.println("Numar puncte bonus: "+ puncteBonus);
		
		System.out.println("----------------------------------");
		AbstractLogger loggerChain = LoggerChainFactory.getChainOfLoggers();
		loggerChain.logMessage(Verbosity.INFO, "This log is FYI");
		loggerChain.logMessage(Verbosity.ERROR, "Something went wrong");
		loggerChain.logMessage(Verbosity.DEBUG, "This is a debug message");
		
		System.out.println("----------------------------------");
		LighBulb bulb = new LighBulb();
		CommandInterface lightOnCommand = new TurnLightOnCommand(bulb);
		CommandInterface lightOffCommand = new TurnOffLightCommand(bulb);
		CommandInterface dimOnCommand = new DimLightCommand(bulb);
		CommandInterface increaseLightIntensityCommand = new IncreaseLightOnCommand(bulb);
		RemoteControll remote = new RemoteControll(lightOnCommand,lightOffCommand,dimOnCommand,increaseLightIntensityCommand);
		
		remote.pressLightOnButton();
		remote.pressDimButton();
		remote.pressIncreaseLightButton();
		remote.pressLightOffButton();
		
	}

}
