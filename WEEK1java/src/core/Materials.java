package core;

public class Materials {
	private int mat_id;
	private String name;
	private String model;
private Course cours;
public Materials(int mat_id, String name, String model, Course cours) {
	super();
	this.mat_id = mat_id;
	this.name = name;
	this.model = model;
	this.cours = cours;
}
public int getMat_id() {
	return mat_id;
}
public void setMat_id(int mat_id) {
	this.mat_id = mat_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public Course getCours() {
	return cours;
}
public void setCours(Course cours) {
	this.cours = cours;
}
@Override
public String toString() {
	return "Materials [mat_id=" + mat_id + ", name=" + name + ", model=" + model + ", cours=" + cours + "]";
}


}
