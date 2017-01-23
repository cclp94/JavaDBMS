package tables;

import java.util.HashMap;

public class CourseTable {
	HashMap<Integer, Course> records;	
	
	public CourseTable(){
		records = new HashMap<Integer, Course>();
	}
	
	public void initialize() {
		Course c = new Course(353, "Databases", 4);
		records.put(c.getCID(), c);
		c = new Course(346, "OS", 4);
		records.put(c.getCID(), c);
		c = new Course(352, "Data Structures", 4);
		records.put(c.getCID(), c);
		c = new Course(472, "AI", 4);
		records.put(c.getCID(), c);
	}


	public boolean hasCourse(int courseNumber) {
		return records.containsKey(courseNumber);
	}

}
