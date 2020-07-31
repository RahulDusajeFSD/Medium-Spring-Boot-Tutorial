package com.training.abc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	String id;
	String name;
	String marks;
	String numOfSubjects;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, String marks, String numOfSubjects) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.numOfSubjects = numOfSubjects;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public String getNumOfSubjects() {
		return numOfSubjects;
	}
	public void setNumOfSubjects(String numOfSubjects) {
		this.numOfSubjects = numOfSubjects;
	}
	
	

}
