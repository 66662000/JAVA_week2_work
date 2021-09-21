package Human;

//To eritate prof to Human
public class Professor extends Human {
	   private int idprofesor;

	   
	   // Constructor
	public Professor(int id, String lname, String fname, String gender, int idprofesor) {
		super(id, lname, fname, gender);
		this.idprofesor = idprofesor;
	}

	//Getter and setter

	public int getIdprofesor() {
		return idprofesor;
	}


	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}

	//ToString method
	
	@Override
	public String toString() {
		return super.toString()+"Professor [idprofesor=" + idprofesor + "]"; //We call tostring from the mother class"Human"
	
	
	}
	   
	 
	   	   
	   

}
