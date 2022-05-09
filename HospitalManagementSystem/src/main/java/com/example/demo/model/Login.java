package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="login")
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String uname;
	private String password;
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String role, String password,String uname) {
		super();
		this.uname = uname;
		this.password = password;
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
