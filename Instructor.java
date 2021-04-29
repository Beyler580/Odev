package Day3;

import java.util.ArrayList;

public class Instructor extends User{
	private ArrayList<Course> givenCourses;
	
	

	public Instructor(int userID, String firstName, String lastName, String password, ArrayList<Course> givenCourses) {
		super(userID, firstName, lastName, password);
		this.givenCourses = givenCourses;
	}

	public ArrayList<Course> getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(ArrayList<Course> givenCourses) {
		this.givenCourses = givenCourses;
	}

}
