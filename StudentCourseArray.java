import java.util.*;

public class StudentCourseArray {

	private String email;
	private ArrayList <Course> courses;	
	
	public StudentCourseArray(String email, ArrayList <Course> courses) {
		this.email = email;
		this.courses = courses;
	}
	
	public StudentCourseArray() {
		email = "";
		courses = {};
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public ArrayList <Courses> getCourses() {	//returns an array of courses
		return courses;
	}
	
	public String getCoursesDisplayed() { //returns a string of all courses in one line
		String str = courses.get(0);
		for(int i = 1; i < courses.size(); i++) 
			str += " " + courses.get(i).getName();
		return str;
	}

}
