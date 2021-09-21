package Human;

public class Student extends Human {
	
	private int stud_id;

	
	//Constructor
	
	public Student(int id, String lname, String fname, String gender, int stud_id) {
		super(id, lname, fname, gender);
		this.stud_id = stud_id;
	}


	public int getStud_id() {
		return stud_id;
	}


	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}


	@Override
	public String toString() {
		return super.toString()+"Student [stud_id=" + stud_id + "]";
	}
	
	
	
	

}
