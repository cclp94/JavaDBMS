package tables;

import java.util.HashMap;

public class StudentTable {
	HashMap<Integer, Student> records;
	
	public StudentTable(){
		records = new HashMap<Integer, Student>();
	}

	public void initialize() {
		Student s =  new Student(27339887, "Caio", "COMP", "ksjgdg@ksldgk.com");
		records.put(s.getSID(), s);
		s =  new Student(27339888, "Jack", "COMP", "ksjgdg@ksldgk.com");
		records.put(s.getSID(), s);
		s =  new Student(27339889, "Nick", "COMP", "ksjgdg@ksldgk.com");
		records.put(s.getSID(), s);
		s =  new Student(27339890, "Rick", "COMP", "ksjgdg@ksldgk.com");
		records.put(s.getSID(), s);	
	}

	public Object getNameById(int sid) {
		Student s  = records.get(sid);
		return s.getName();
	}
}
