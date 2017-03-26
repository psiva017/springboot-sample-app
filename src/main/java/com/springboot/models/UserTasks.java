package com.springboot.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class UserTasks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@Column(name = "task_id")
	private Task tasks;

	@Column(name = "task_name")
	private String taskName;

	@Column(name = "planned_start_date")
	private Date plannedStartDate;
	@Column(name = "planned_end_date")
	private Date plannedEndDate;

	@Column(name = "actual_start_date")
	private Date actualStartDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Task getTasks() {
		return tasks;
	}

	public void setTasks(Task tasks) {
		this.tasks = tasks;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Date getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(Date plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public Date getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(Date plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public Date getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public Date getActualEndDate() {
		return actualEndDate;
	}

	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}

	public Date getRejectedDate() {
		return rejectedDate;
	}

	public void setRejectedDate(Date rejectedDate) {
		this.rejectedDate = rejectedDate;
	}

	public Status getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(Status taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public String getRejectedReason() {
		return rejectedReason;
	}

	public void setRejectedReason(String rejectedReason) {
		this.rejectedReason = rejectedReason;
	}

	@Column(name = "actual_end_date")
	private Date actualEndDate;

	@Column(name = "rejectedDate")
	private Date rejectedDate;

	@OneToOne
	@JoinColumn(name = "task_status")
	private Status taskStatus;

	@OneToOne
	@JoinColumn(name = "task_priority")
	private Priority priority;

	@Column(name = "rejected_reason")
	private String rejectedReason;
}
