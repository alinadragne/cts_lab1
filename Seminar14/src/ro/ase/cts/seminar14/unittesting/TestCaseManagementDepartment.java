package ro.ase.cts.seminar14.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCaseManagementDepartment {
	
	ManagementDepartment department;
	static final ArrayList<Student> DEFAULT_STUDENTS;
	
	static {
		DEFAULT_STUDENTS = new ArrayList<Student>();
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		DEFAULT_STUDENTS.add(new Student("Toni", 22, new int[]{9, 8, 10}));
		DEFAULT_STUDENTS.add(new Student("Alina", 21, new int[]{9, 9, 6}));
		DEFAULT_STUDENTS.add(new Student("Razvan", 21, new int[]{5, 6, 7}));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		department = new ManagementDepartment();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculBursaStub() {
		AbstractStudent defaultStudent = new AbstractStudent() {
			@Override
			public float computeAverage() throws StudentExceptionWrongValue {
				// TODO Auto-generated method stub
				return 8;
			}
		};
		
		ArrayList<AbstractStudent> studentsList = new ArrayList<AbstractStudent>();
		studentsList.add(defaultStudent);
		department.setStudents(studentsList);
		department.computeScholarship(0);
		
		float scholarshipQuantum = department.computeScholarship(0);
		assertEquals(ScholarshipType.MERITOUS.getQuantum(), scholarshipQuantum, "The computed scholarship quantum is not correct");
	}
	
	@Test 
	void testCalculBursaStubCuClasaConcreta() {
		
		StudentStub defaultStudent = new StudentStub();
		defaultStudent.setComputedAverage(8);
		defaultStudent.setExceptionalCase(true);
		
		ArrayList<AbstractStudent> studentsList = new ArrayList<AbstractStudent>();
		studentsList.add(defaultStudent);
		department.setStudents(studentsList);
		department.computeScholarship(0);
		
		float scholarshipQuantum = department.computeScholarship(0);
		assertEquals(ScholarshipType.MERITOUS.getQuantum(), scholarshipQuantum, "The computed scholarship quantum is not correct");
	}

}
