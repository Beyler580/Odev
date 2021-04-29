package Day3;

import java.util.ArrayList;

public class Student extends User{
	private ArrayList<Course> takenCourses;




	public Student(int userID, String firstName, String lastName, String password, ArrayList<Course> takenCourses) {
		super(userID, firstName, lastName, password);
		this.takenCourses = takenCourses;
	}

	public ArrayList<Course> getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(ArrayList<Course> takenCourses) {
		this.takenCourses = takenCourses;
	}
	

}
