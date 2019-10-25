package com.dlsl.queue;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Service {
	
	@Id
	@Column(name= "id")
	private String id;
	
	@Column(name = "queue_no")
	private String queue_no;
	
	@Column(name = "cashier_number")
	private String cashier_number;
	
	@Column(name = "student_number")
	private String student_number;
	
	@Column(name = "queueing_status")
	private String queueing_status;
	
	@Column(name = "service_type")
	private String service_type;
	
	@Column(name = "service_lane")
	private String service_lane;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getQueue_no() {
		return queue_no;
	}

	public void setQueue_no(String queue_no) {
		this.queue_no = queue_no;
	}

	public String getCashier_number() {
		return cashier_number;
	}

	public void setCashier_number(String cashier_number) {
		this.cashier_number = cashier_number;
	}

	public String getStudent_number() {
		return student_number;
	}

	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}

	public String getQueueing_status() {
		return queueing_status;
	}

	public void setQueueing_status(String queueing_status) {
		this.queueing_status = queueing_status;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public String getService_lane() {
		return service_lane;
	}

	public void setService_lane(String service_lane) {
		this.service_lane = service_lane;
	}
	
	
	
}
