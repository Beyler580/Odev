package Day3;

import java.util.ArrayList;

public class StudentManager {
	public void showTakenCourses(ArrayList<Course> courses) {	
		if(courses.size() == 0) {
			System.out.println("Su an bir kursa sahip degilsiniz . ");
		}
		for (Course course : courses) {
			System.out.println
					(
							"Kurs ID: "+course.getCourseID()+"\n"+
							"Kurs ismi: "+course.getTitle()+"\n"+
							"Kurs Egitimcisi: "+course.getCourseInstructor()+"\n"+
							"Kurs Ucreti: "+course.getCoursePrice()+"\n"+
							"Kurs Hakkinda: "+course.getDetail()+"\n"+"\n"+
							"------------------------------------------------"
							
							
					);

		}
		
	}
	
	public void takeCourse(Course course,ArrayList<Course> takenCourses) {
		takenCourses.add(course);
		System.out.println("Kurs Basariyla Eklendi...");

	}
	
	

}
