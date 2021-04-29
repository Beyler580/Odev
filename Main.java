package Day3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Course> givenCourses = new ArrayList<Course>();
		ArrayList<Course> takenCourses = new ArrayList<Course>();
		Course javaCourse  = new Course("Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)", 1, "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.", "Engin Demirog",0);
		Course csharpCourse = new Course("Yazılım Geliştirici Yetiştirme Kampı", 2, "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.", "Engin Demirog", 0);
		givenCourses.add(javaCourse);
		givenCourses.add(csharpCourse);

		
		StudentManager studentManager = new StudentManager();
		studentManager.showTakenCourses(takenCourses);
		System.out.println("---------------------------");
		studentManager.takeCourse(javaCourse, takenCourses);
		studentManager.takeCourse(csharpCourse, takenCourses);
		System.out.println("---------------------------");
		studentManager.showTakenCourses(takenCourses);
		
		
		//Instructor
		InstructorManager instructorManager = new InstructorManager();
		Instructor engindemirog = new Instructor(1, "Engin", "Demirog", "1234567", givenCourses);
		instructorManager.showGivenCourses(givenCourses);
		//Scanner calisacak altdaki satirda 
		instructorManager.addNewCourse(givenCourses);
		System.out.println("**************************************************");
		instructorManager.showGivenCourses(givenCourses);
		
		

	}

}
