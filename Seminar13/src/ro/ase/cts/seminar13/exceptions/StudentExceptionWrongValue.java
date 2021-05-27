package ro.ase.cts.seminar13.exceptions;

public class StudentExceptionWrongValue extends Exception {

	public StudentExceptionWrongValue(String mesaj) {
		System.out.println(mesaj);
	}
}
