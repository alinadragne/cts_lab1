package ro.ase.acs.semina10.chain;

public abstract class AbstractLogger {
	
	protected Verbosity level;
	protected AbstractLogger nextLogger;
	
	public void setNextLogegr(AbstractLogger logger) {
		this.nextLogger = logger;
	}
	
	public void logMessage(Verbosity level, String message) {
		//if(this.level <= level) {
			
		//}
	}
	
	abstract void write(String message);
	
}
