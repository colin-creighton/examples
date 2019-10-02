package uk.ac.belfastmet.examples1;

public class Student {
	String name = "";
	int age;
	
	public static int numberOfStudents;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		numberOfStudents++;
	}

	public Student() {
		super();
		numberOfStudents++;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

}
