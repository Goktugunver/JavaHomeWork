
public class Course {

	int courseId;
	String courseName;
	String courseInstructerName;
	double courseProgressLevel;
	
	
	public Course(int courseId, String courseName, 
			String courseInstructerName, int courseProgressLevel) {
	
		this.courseId=courseId;
		this.courseName=courseName;
		this.courseInstructerName=courseInstructerName;
		this.courseProgressLevel=courseProgressLevel;
		
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseInstructerName() {
		return courseInstructerName;
	}


	public void setCourseInstructerName(String courseInstructerName) {
		this.courseInstructerName = courseInstructerName;
	}


	public double getCourseProgressLevel() {
		return courseProgressLevel;
	}


	public void setCourseProgressLevel(double courseProgressLevel) {
		this.courseProgressLevel = courseProgressLevel;
	}


	
		
}
