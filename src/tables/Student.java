package tables;

public class Student {
	private int SID;
	private String name;
	private String major;
	private String email;

	public Student() {
	}
	
	

	public Student(int sID, String name, String major, String email) {
		super();
		SID = sID;
		this.name = name;
		this.major = major;
		this.email = email;
	}



	public int getSID() {
		return SID;
	}

	public void setSID(int sID) {
		SID = sID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}