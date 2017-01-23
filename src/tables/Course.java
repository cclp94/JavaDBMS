package tables;

public class Course {
	private int CID;
	private String CName;
	private int nCredits;

	public Course() {
	}
	
	

	public Course(int cID, String cName, int nCredits) {
		super();
		CID = cID;
		CName = cName;
		this.nCredits = nCredits;
	}



	public int getCID() {
		return CID;
	}

	public void setCID(int cID) {
		CID = cID;
	}

	public String getCName() {
		return CName;
	}

	public void setCName(String cName) {
		CName = cName;
	}

	public int getnCredits() {
		return nCredits;
	}

	public void setnCredits(int nCredits) {
		this.nCredits = nCredits;
	}
}