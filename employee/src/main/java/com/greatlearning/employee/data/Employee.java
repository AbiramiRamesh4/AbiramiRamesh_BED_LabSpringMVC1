package com.greatlearning.employee.data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "employee")
@Getter
@Setter
public class Employee {
	
	@Column(name ="Emp_FirstName")
	private String FirstName ;
	@Column(name ="Emp_LastName")
	private String LastName ;
	@Column(name ="Emp_Email")
	private String Email;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="Emp_ID")
	private int ID;
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

}
