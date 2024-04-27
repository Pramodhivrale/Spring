package jdbc1;

public class Student 
{
	private String user;
	private String gender;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	

	public Student(String user, String gender) {
		super();
		this.user = user;
		this.gender = gender;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
