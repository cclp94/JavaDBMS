package driver;

import tables.Database;

public class Driver {

	public static void main(String[] args) {
		Database db = new Database();
		db.initialize();
		System.out.println(db.lookupGradesForCourse(353));
	}

}
