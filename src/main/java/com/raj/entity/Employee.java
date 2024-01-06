package com.raj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emplyee_detail")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_Id")
	private Long id;
	
	@Column(name="emp_name",length=20,nullable=false)
	private String name;
	
	@Column(name="emp_email",length=20,unique=true,nullable=false)
	private String email;
	
	@Column(name="emp_department",length=20,nullable=false)
	private String department;
	
	@Column(name="emp_password",length=12,unique=true,nullable=false)
	private String password;
	
	public Employee() {}
	

	public Employee(String name, String email, String department, String password) {
		this.name = name;
		this.email = email;
		this.department = department;
		this.password = password;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", department=" + department
				+ ", password=" + password + "]";
	}	
}
