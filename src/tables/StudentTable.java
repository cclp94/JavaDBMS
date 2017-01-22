package tables;

import java.util.HashMap;

public class StudentTable {
	HashMap<Integer, Student> records;
	
	private class Student{
		private int SID;
		private String name;
		private String major;
		private String email;
		
		public Student(int sID, String name, String major, String email) {
			super();
			SID = sID;
			this.name = name;
			this.major = major;
			this.email = email;
		}
		
	}

	public void initialize() {
		// TODO Auto-generated method stub
		
	}

	public Object getNameById(int sid) {
		// TODO Auto-generated method stub
		return null;
	}
}
