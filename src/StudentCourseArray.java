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
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public ArrayList <Course> getCourses() {	//returns an array of courses
		return courses;
	}
	
	public String getCoursesDisplayed() { //returns a string of all courses in one line
		String str = email + "\n";
		for(int i = 0; i < courses.size(); i++) 
			str += courses.get(i).getName();
		return str;
	}

}
