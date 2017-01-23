package tables;

public class Grade {
	private int CID;
	private int SID;
	private int year;
	private char semester;
	private String grade;

	public Grade() {
	}

	public Grade(int cID, int sID, int year, char semester, String grade) {
		super();
		CID = cID;
		SID = sID;
		this.year = year;
		this.semester = semester;
		this.grade = grade;
	}

	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}

	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public char getSemester() {
		return semester;
	}

	public void setSemester(char semester) {
		this.semester = semester;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}