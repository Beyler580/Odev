package Day3;

public class Course {
	private int coursePrice;
	private String title;
	private int courseID;
	private String detail;
	private String courseInstructor;
	public Course(String title, int courseID, String detail, String courseInstructor,int coursePrice) {
		super();
		this.title = title;
		this.courseID = courseID;
		this.detail = detail;
		this.courseInstructor = courseInstructor;
		this.coursePrice = coursePrice;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getCourseInstructor() {
		return courseInstructor;
	}
	public void setCourseInstructor(String courseInstructor) {
		this.courseInstructor = courseInstructor;
	}
	public int getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(int coursePrice) {
		this.coursePrice = coursePrice;
	}
	

}
