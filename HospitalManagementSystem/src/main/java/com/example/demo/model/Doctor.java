package com.example.demo.model;

import javax.persistence.*;
import javax.persistence.GeneratedValue;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String role;
	private String fname;
	private String lname;
	private String emailid;
	private String bloodgroup;
	private String age;
	private String loginid;
	private String password;
	private String qualification;
	private String specialization;
	private String dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = "Doctor";
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Doctor(int id, String role, String fname, String lname, String emailid, String bloodgroup, String age,
			String loginid, String password, String qualification, String specialization, String dob) {
		super();
		this.id = id;
		this.role = role;
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
		this.bloodgroup = bloodgroup;
		this.age = age;
		this.loginid = loginid;
		this.password = password;
		this.qualification = qualification;
		this.specialization = specialization;
		this.dob = dob;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
