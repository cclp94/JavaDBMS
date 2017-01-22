package tables;

import java.util.List;

public class Database {
	private StudentTable students;
	private CourseTable courses;
	private GradeTable grades;
	
	public Database(){
		students = new StudentTable();
		courses = new CourseTable();
		grades = new GradeTable();
	}
	
	public void initialize(){
		students.initialize();
		courses.initialize();
		grades.initialize();
	}
	
	public String lookupGradesForCourse(int courseNumber){
		if(!courses.hasCourse(courseNumber))
			return "Course not registered";
		List<Grade> matchGrades = grades.lookupCourseGrades(courseNumber);
		if(matchGrades.isEmpty())
			return "No Grades registered for this course";
		StringBuilder queryResult = new StringBuilder();
		for(Grade g : matchGrades){
			queryResult.append(g.getSID());queryResult.append('-');
			queryResult.append(students.getNameById(g.getSID()));
			queryResult.append(" "); queryResult.append(g.getGrade());
			queryResult.append("\n");
		}
		return queryResult.toString();
	}
}
