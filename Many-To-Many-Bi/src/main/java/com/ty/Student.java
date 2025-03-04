package com.ty;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	@Id
	private int stuId;

	private String name;

	@ManyToMany
	@JoinTable(
			   joinColumns = @JoinColumn(name = "student_id"),
			   inverseJoinColumns = @JoinColumn(name = "subject_id")
			  )
	private List<Subject> subjects;

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + "]";
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

}
