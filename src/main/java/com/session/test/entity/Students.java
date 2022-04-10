package com.session.test.entity;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sid", nullable = false, unique = true)
	public Integer sId;
	@Column(name = "first_name", nullable = false, length = 30)
	public String firstName;
	@Column(name = "last_name", nullable = false, length = 30)
	public String lastName;
	@Column(name = "gender", nullable = false, length = 6)
	public String gender;
	@Column(name = "user_name", nullable = false, length = 30)
	public String userName;
	@Column(name = "password", nullable = false, length = 30)
	public String password;
	@Column(name = "reg_date")
	public Date regDate;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(Integer sId, String firstName, String lastName, String gender, String userName, String password,
			Date regDate) {
		super();
		this.sId = sId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		this.regDate = regDate;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate() {
		this.regDate = new Date();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Students [sId=").append(sId).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append(", gender=").append(gender).append(", userName=").append(userName)
				.append(", password=").append(password).append(", regDate=").append(regDate).append("]");
		return builder.toString();
	}

}
