/**
 * 
 */
package com.springboot.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * This is Student Entity Class
 * 
 * @author psiva
 *
 */
@Entity
// ----------- Named Queries Section STARTS ----------
@NamedQueries({ @NamedQuery(name = "getUserByEmail", query = "From User u where u.email =:email"),
		@NamedQuery(name = "getAllUser", query = "From User"),
		@NamedQuery(name = "getUserById", query = "From User u where u.id =:id"),
		@NamedQuery(name = "getUserByRole", query = "From User u where u.role.id = :roleId") })
// ----------- Named Queries Section ENDS ----------

@Table(name = "users")
public class User {

	public User() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")

	private Long id;

	private String name;

	private Date DOB;

	private String email;

	@Column(name = "mobile_no")

	private String mobileNo;

	private String password;

	@Column(name = "password_salt")

	private String passwordSalt;

	@Column(name = "compaly_name")

	private String company;

	@ManyToOne
	@JoinColumn(name = "role")

	private Role role;

	@Column(name = "is_active")
	private Boolean isActive;

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

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordSalt() {
		return passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public User(String name, Long id, Date DOB) {
		this.name = name;
		this.id = id;
		this.DOB = DOB;
	}
}
