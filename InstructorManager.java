package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class InstructorManager {
	Scanner scanner = new Scanner(System.in);
	public void showGivenCourses(ArrayList<Course> courses) {
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
	public void addNewCourse(ArrayList<Course> courses) {
		System.out.println("Kurs ID: ");
		int id = scanner.nextInt();
		System.out.println("Kurs Ucreti: ");
		int price = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Kurs adi: ");
		String title = scanner.nextLine();
		
		System.out.println("Kurs Hakkinda: ");
		String details = scanner.nextLine();
		
		System.out.println("Kursun Egitimcisi: ");
		String instructor = scanner.nextLine();
		courses.add(new Course(title, id, details, instructor, price));
		System.out.println("Kurs basariyla Eklendi...");
		
		
		
		
		
	}
	

}
