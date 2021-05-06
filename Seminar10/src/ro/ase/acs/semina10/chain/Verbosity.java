package ro.ase.acs.semina10.chain;

public enum Verbosity {
	INFO(1), DEBUG(2), ERROR(3);

	public int verbosity;

	Verbosity(int i) {
		this.verbosity = i;
	}

	public int getVerbosity() {
		return verbosity;
	}
}
