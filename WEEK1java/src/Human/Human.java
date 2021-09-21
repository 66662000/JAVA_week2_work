package Human;

public class Human 
// Class: attributs(properties), methods :what it can do.
//encapsulation: att=>private(should be in the class to have access to), meth=>public... =>getter,setter.
//Construtor: help to create an object.
{
	//attributs
	
   private int id;
   private String lname;
   private String fname;
   private String gender;
   
   //The constructor: its a method
   
public Human(int id, String lname, String fname, String gender) {
	super();//If it was erited to another class=> it associates ...
	this.id = id;
	this.lname = lname;
	this.fname = fname;
	this.gender = gender;
}


//Getter and setter

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}


@Override
public String toString() {
	return "Human [id=" + id + ", lname=" + lname + ", fname=" + fname + ", gender=" + gender + "]";
}

   
   
   
}
