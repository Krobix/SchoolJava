package chapter6;

public class Student {
	private String name;
	private int absences;
	
	public Student(String n, int a) {
		name = n;
		absences = a;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAbsenceCount() {
		return absences;
	}
}
