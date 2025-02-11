package com.ty;

import java.time.LocalDateTime;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Cacheable
@Table(name = "emp_info") // to provide custom name to table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen") // To auto generate the id
	@SequenceGenerator(name = "seq_gen", initialValue = 9, allocationSize = 5)
	private int eid;

	@Column(name = "user_name") // to provide custom name to the column
	private String name;

	@Column(unique = true, nullable = false) // to apply unique and not null
												// constraints to the column
	private String email;

	private double salary;

	@CreationTimestamp // to store date and time at which record is inserted
	@Column(updatable = false) // to restrict updating this column
	private LocalDateTime createdDate;

	@UpdateTimestamp // to store the date and time at which record is updated
	private LocalDateTime updatedDate;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", salary=" + salary + ", createdDate="
				+ createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

}
