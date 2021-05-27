package ro.ase.cts.unittesting;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ro.ase.cts.seminar13.Student;
import ro.ase.cts.seminar13.exceptions.StudentExceptionWrongValue;
import org.junit.jupiter.api.function.Executable;

class StudentTestCase {
	
	Student student;
	String defaultNume = "Anonim";
	int defaultVarsta = 18;
	int defaultNote[] = {}; 

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass was called");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass was called");
	}

	@BeforeEach
	void setUp() throws Exception {
		student = student=new Student(defaultNume,defaultVarsta,defaultNote);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown was called");
	}
	
    /* right/conformance test */
	@Test
	void testStudentConstructorRight() {
		String studentName = "Alina";
		int studentAge = 27;
		int grades[] = {9, 9 ,9};
		
		Student student = new Student(studentName, studentAge, grades);
		assertEquals(studentName, student.nume, "Name is not equal");
		assertEquals(studentAge, student.varsta, "Age is not equal");
		assertEquals(grades, student.note, "Grades are not equal");
	}
	
	@Test
	void testStudentConstructoriRightNotNull() {
		int grades[] = {10, 10 ,9};
		
		Student student = null;
		try{
			student = new Student("Alina", 21, grades);
	
		} catch(Exception e) {
			fail("Constructorul nu trb sa arunce exceptie");
		}
		assertNotNull(student);
	}
	

	
	@Test
	void testStudentSetVarstaErrorCodition() {
		assertThrows(StudentExceptionWrongValue.class, ()->{
			student.setVarsta(-1);
		});
		
	}
	
	@Test
	void testStudentGetVarstaRight() {
		int expectedValue=defaultVarsta;
		int actualValue=student.getVarsta();
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testComputeAverageErrorCondition() {
		try {
			student.setNote(null);
		} catch (StudentExceptionWrongValue e) {
			e.printStackTrace();
		}
		assertThrows(StudentExceptionWrongValue.class, new Executable() {

			@Override 
			public void execute() throws Throwable {
				student.computeAverage();
			}
		});
	}
	
	@Test
	void testCalculMedieRightTwoDecimals() throws StudentExceptionWrongValue {
		float expectedValue = 9.00f;
		float actualValue = student.computeAverage();
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSetNoteBoundaryCondition() {
		int invalidNote[] = new int[3];
		for(int i = 0; i < 2; i++) {
			invalidNote[i] =  5 + i;
		}
		invalidNote[2] = 20;
		assertThrows(StudentExceptionWrongValue.class, () -> {
			student.setNote(invalidNote);
		});
	}
	
	
}
