package com.multicampus.biz.user;
//import lombok.Data;

//@Data
public class UserVO {
	private String Id;
	private String Password;
	private String Name;
	private String Role;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	@Override
	public String toString() {
		return "UserVO [Id=" + Id + ", Password=" + Password + ", Name=" + Name + ", Role=" + Role + "]";
	}

	

}
