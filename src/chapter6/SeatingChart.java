package chapter6;
import java.util.*;

public class SeatingChart {
	private Student[][] seats;
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		SeatingChart se;
		list.add(new Student("joe",1));
		list.add(new Student("brendon", 0));
		list.add(new Student("joe 2", 3));
		list.add(new Student("brendon 2", 5));
		list.add(new Student("joe 3",1));
		se = new SeatingChart(list, 3, 2);
		System.out.println(Arrays.deepToString(se.getSeats()));
		se.removeAbsentStudents(2);
		System.out.println(Arrays.deepToString(se.getSeats()));
	}
	
	public SeatingChart(ArrayList<Student> studentList, int rows, int cols) {
		seats = new Student[rows][cols];
		for(int i=0; i<seats.length; i++) {
			for(int k=0; k<seats[0].length; k++) {
				if((i*cols)+k<studentList.size()) {
					seats[i][k] = studentList.get((i*cols)+k);
				}
				else seats[i][k] = null;
			}
		}
	}
	
	public int removeAbsentStudents(int allowed) {
		int removed = 0;
		for(int i=0; i<seats.length; i++) {
			for(int k=0; k<seats[0].length; k++) {
				if(seats[i][k]==null) continue;
				else if(seats[i][k].getAbsenceCount()>allowed) {
					seats[i][k] = null;
					removed++;
				}
			}
		}
		return removed;
	}
	
	public Student[][] getSeats(){
		return seats;
	}
}
