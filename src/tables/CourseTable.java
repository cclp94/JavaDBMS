package tables;

import java.util.HashMap;

public class CourseTable {
	HashMap<String, Course> records;
	
	private class Course{
		private int CID;
		private String CName;
		private String nCredits;
		public Course(int cID, String cName, String nCredits) {
			super();
			CID = cID;
			CName = cName;
			this.nCredits = nCredits;
		}
		
		
	}
	
	
	public void initialize() {
		// TODO Auto-generated method stub
		
	}


	public boolean hasCourse(int courseNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
