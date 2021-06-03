package ro.ase.cts.seminar14.unittesting;

public class StudentStub extends AbstractStudent {
	
	float computedAverage = 0.0f;
	boolean exceptionalCase = false;
	
	public float getComputedAverage() {
		return computedAverage;
	}

	public void setComputedAverage(float computedAverage) {
		this.computedAverage = computedAverage;
	}
	
	public boolean isExceptionalCase() {
		return exceptionalCase;
	}

	public void setExceptionalCase(boolean exceptionalCase) {
		this.exceptionalCase = exceptionalCase;
	}

	@Override
	public float computeAverage() throws StudentExceptionWrongValue {
		if(exceptionalCase) {
			throw new StudentExceptionWrongValue("Compute average exception raised");
		}
		return computedAverage;
	}

}