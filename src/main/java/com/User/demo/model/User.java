package com.User.demo.model;
import java.util.*;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.annotation.sql.DataSourceDefinitions;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(schema="users" , name="userTable")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Userid")
	private Integer Userid ;
	@Column(name="Username")
	private String Username ;
	@Column(name="Userrole")
	private String Userrole ;
	@Column(name="cityname")
	private String cityname ;
	@Column(name="phoneNo")
	private String phoneNo ;
	
	
	public User(Integer userid, String username, String userrole, String cityname, String phoneNo) {
		super();
		Userid = userid;
		Username = username;
		Userrole = userrole;
		this.cityname = cityname;
		this.phoneNo = phoneNo;
	}
	public User() {
		super();
	}
	public Integer getUserid() {
		return Userid;
	}
	public void setUserid(Integer userid) {
		Userid = userid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getUserrole() {
		return Userrole;
	}
	public void setUserrole(String userrole) {
		Userrole = userrole;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
