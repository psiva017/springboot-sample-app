package com.springboot.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Task {

	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name = "id")
	  private Long id;
	 
	 @Column(name="task_name")
	 private String tsakName;
	 
	 private String description;
	 
	 @Column(name="is_active")
	 private Boolean isActive;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTsakName() {
		return tsakName;
	}

	public void setTsakName(String tsakName) {
		this.tsakName = tsakName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	 
	 
}
