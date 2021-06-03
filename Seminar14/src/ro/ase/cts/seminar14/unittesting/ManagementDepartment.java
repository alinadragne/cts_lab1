package ro.ase.cts.seminar14.unittesting;

import static org.junit.Assert.fail;

import java.util.ArrayList;

public class ManagementDepartment {
	private static final int EXCELENCY_THRESHOLD = 9;
	private static final int MERITOUS_THRESHOLD = 8;

	ArrayList<AbstractStudent> students;
	
	public ManagementDepartment() {
		this.students = new ArrayList<AbstractStudent>();
	}

	public ManagementDepartment(ArrayList<AbstractStudent> students) {
		super();
		this.students = students;
	}
	
	float computeScholarship(int studentIndex) {
		float studentAverage = 0.0f;
			try {
				studentAverage = students.get(studentIndex).computeAverage();
			} catch (ro.ase.cts.seminar14.unittesting.StudentExceptionWrongValue e) {
				fail("Test failed at computeAverage() method");
			}

		if(studentAverage > EXCELENCY_THRESHOLD) {
			return ScholarshipType.EXCELENCY.getQuantum();
		}else if(studentAverage > MERITOUS_THRESHOLD) {
			return ScholarshipType.MERITOUS.getQuantum();
		}else {
			return 0.0f;
		}
	}

	public ArrayList<AbstractStudent> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<AbstractStudent> students) {
		this.students = students;
	}
	
	
}
