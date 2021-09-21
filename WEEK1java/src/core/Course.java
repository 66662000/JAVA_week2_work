package core;

import Human.Professor;

public class Course {
	
	private int course_id;
	private String course_name;
	private String course_prof;
	private String course_description;
	private int course_duration;
	
	//let's create an attribute for Professor to be able to create course
	private Professor professor;

	//Constructor
	
	public Course(int course_id, String course_name, String course_prof, String course_description, int course_duration,
			Professor professor) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_prof = course_prof;
		this.course_description = course_description;
		this.course_duration = course_duration;
		this.professor = professor;
	}

	//Surcharge contrusteur
	
	
	
	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_prof() {
		return course_prof;
	}

	public void setCourse_prof(String course_prof) {
		this.course_prof = course_prof;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}

	public int getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "course [course_id=" + course_id + ", course_name=" + course_name + ", course_prof=" + course_prof
				+ ", course_description=" + course_description + ", course_duration=" + course_duration + ", professor="
				+ professor + "]";
	}

	
}
