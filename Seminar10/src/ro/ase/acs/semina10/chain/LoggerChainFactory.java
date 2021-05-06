package ro.ase.acs.semina10.chain;

public class LoggerChainFactory {

	public static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(Verbosity.ERROR);
		AbstractLogger fileLogger = new FileLogger(Verbosity.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(Verbosity.INFO);

		errorLogger.setNextLogegr(fileLogger);
		fileLogger.setNextLogegr(consoleLogger);
		
		return errorLogger;
	}
}
