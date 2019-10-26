package com.dlsl.queue;

public class UsersDto {
	
	private String id;
	
	private String currently_queueing;
	
	private String name;
	
	private String password;
	
	private String student_number;
	
	private String cashier_number;
	
	private String queue_number;
	
	private String is_priority;

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

	public String getCashier_number() {
		return cashier_number;
	}

	public void setCashier_number(String cashier_number) {
		this.cashier_number = cashier_number;
	}

	public String getQueue_number() {
		return queue_number;
	}

	public void setQueue_number(String queue_number) {
		this.queue_number = queue_number;
	}

	public String getIs_priority() {
		return is_priority;
	}

	public void setIs_priority(String is_priority) {
		this.is_priority = is_priority;
	}

}
