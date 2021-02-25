package com.bean;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.ForeignKey;
@Entity
public class Booking {
	@Id
	private int bid;
	private String fromloc;
	private String toloc;
	private LocalDateTime dateofbooking;
	private int bpid;
	private int bfid;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getFromloc() {
		return fromloc;
	}
	public void setFromloc(String fromloc) {
		this.fromloc = fromloc;
	}
	public String getToloc() {
		return toloc;
	}
	public void setToloc(String toloc) {
		this.toloc = toloc;
	}
	public LocalDateTime getDateofbooking() {
		return dateofbooking;
	}
	public void setDateofbooking(LocalDateTime dateofbooking) {
		this.dateofbooking = dateofbooking;
	}
	public int getBpid() {
		return bpid;
	}
	public void setBpid(int bpid) {
		this.bpid = bpid;
	}
	public int getBfid() {
		return bfid;
	}
	public void setBfid(int bfid) {
		this.bfid = bfid;
	}
	

}
