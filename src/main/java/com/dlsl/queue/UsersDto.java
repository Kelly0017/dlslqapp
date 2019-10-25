package com.dlsl.queue;

public class UsersDto {
	
	private String id;
	
	private String currently_queueing;
	
	private String name;
	
	private String password;
	
	private String student_number;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCurrently_queueing() {
		return currently_queueing;
	}

	public void setCurrently_queueing(String currently_queueing) {
		this.currently_queueing = currently_queueing;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStudent_number() {
		return student_number;
	}

	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}

}
