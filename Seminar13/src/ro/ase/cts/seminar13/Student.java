package ro.ase.cts.seminar13;

import ro.ase.cts.seminar13.exceptions.StudentExceptionWrongValue;

public class Student {
	/* constraints
	 * nume - [3-255 caractere],
	 * varsta - [18 -30]
	 * note - [1-10]
	 */
	private static int NOTA_MAX = 10;
	private static int NOTA_MIN = 1;
	

	public String nume;
	public int varsta;
	public int note[];
	
	public Student(String nume, int varsta, int[] note) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) throws StudentExceptionWrongValue {
		if(varsta<0) {
			throw new StudentExceptionWrongValue("Values can't be 0");
		}
		else this.varsta = varsta;
	}

	public int[] getNote() {
		return note;
	}

	public void setNote(int[] note) throws StudentExceptionWrongValue {
		for(int i = 0; i<note.length; i++) {
			if(note[i] > NOTA_MAX || note[i]< NOTA_MIN) {
				throw new StudentExceptionWrongValue("Value not ok");
			}
			this.note = note;
		}
		
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