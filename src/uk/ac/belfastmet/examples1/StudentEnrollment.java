package uk.ac.belfastmet.examples1;

public class StudentEnrollment {

	public static void main(String[] args) {
		Student student1 = new Student("Dave", 17);
		Student student2 = new Student("Morgan", 45);
		System.out.println(student1.getNumberOfStudents());
		Student student3 = new Student("Freeman", 24);
		System.out.println(student1.getNumberOfStudents());
		
	}

}
