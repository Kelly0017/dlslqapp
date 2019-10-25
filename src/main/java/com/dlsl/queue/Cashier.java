package com.dlsl.queue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cashier {

	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "cashier_number")
	private String cashier_number;
	
	@Column(name = "cashier_type")
	private String cashier_type;
	
	@Column(name = "current_queue_number")
	private String current_queue_number;
	
	@Column(name = "number_of_queue")
	private String number_of_queue;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCashier_number() {
		return cashier_number;
	}

	public void setCashier_number(String cashier_number) {
		this.cashier_number = cashier_number;
	}

	public String getCashier_type() {
		return cashier_type;
	}

	public void setCashier_type(String cashier_type) {
		this.cashier_type = cashier_type;
	}

	public String getCurrent_queue_number() {
		return current_queue_number;
	}

	public void setCurrent_queue_number(String current_queue_number) {
		this.current_queue_number = current_queue_number;
	}

	public String getNumber_of_queue() {
		return number_of_queue;
	}

	public void setNumber_of_queue(String number_of_queue) {
		this.number_of_queue = number_of_queue;
	}
	
}
