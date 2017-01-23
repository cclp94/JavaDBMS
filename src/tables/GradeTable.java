package tables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class GradeTable {
	HashMap<String, Grade> records;
	
	public GradeTable(){
		records = new HashMap<String, Grade>();
	}

	public void initialize() {
		Grade g = new Grade(353, 27339887, 2016, 'w', "A+");
		records.put(g.getSID()+"-"+g.getCID(), g);
		g = new Grade(353, 27339888, 2016, 'w', "B+");
		records.put(g.getSID()+"-"+g.getCID(), g);
		g = new Grade(353, 27339889, 2016, 'w', "C+");
		records.put(g.getSID()+"-"+g.getCID(), g);
		g = new Grade(353, 27339890, 2016, 'w', "A+");
		records.put(g.getSID()+"-"+g.getCID(), g);
		g = new Grade(472, 27339887, 2016, 'w', "A+");
		records.put(g.getSID()+"-"+g.getCID(), g);
		g = new Grade(352, 27339888, 2016, 'f', "B+");
		records.put(g.getSID()+"-"+g.getCID(), g);
	}

	public List<Grade> lookupCourseGrades(int courseNumber) {
		// TODO Auto-generated method stub
		List<Grade> matchGrades  =  new ArrayList<Grade>();
		Iterator<String> it = records.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			int gradeCourseNumber = Integer.parseInt(key.split("-")[1]);
			if(gradeCourseNumber == courseNumber)
				matchGrades.add(records.get(key));
		}
		return matchGrades;
	}

}
