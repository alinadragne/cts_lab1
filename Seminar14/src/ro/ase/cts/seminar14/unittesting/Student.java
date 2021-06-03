package ro.ase.cts.seminar14.unittesting;

public class Student {
	
	String nume;
	int varsta;
	int note[];
	
	public Student(String nume, int varsta, int[] note) {
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}

	public String getNume() {
		return nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public int[] getNote() {
		return note;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) throws StudentExceptionWrongValue {
		if(varsta < 0) 
			throw new StudentExceptionWrongValue("Only accepts pozitive values");
		this.varsta = varsta;
	}

	public void setNote(int[] note) throws StudentExceptionWrongValue {
		if(note != null) {
			for(int i = 0; i < note.length; i++) {
				if(note[i] <= 0 || note[i] > 10) {
					throw new StudentExceptionWrongValue("Out of bounds value");
				}
			}
		}
		this.note = note;
	}
	
	public float computeAverage() throws StudentExceptionWrongValue {
		if(note == null) {
			throw new StudentExceptionWrongValue("Only not null values accepted");
		}
		float avg = 0;
		for(int i = 0; i < note.length; i++) {
			avg += note[i];
		}
		avg = avg / note.length ;
		return avg * 100 / 100.0f;
	}
	
	
	
	
}

