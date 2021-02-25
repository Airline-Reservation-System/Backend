package com.bean;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
@Entity
public class Flight {
	@Id
    private int fid;
    private int aid;
    private String aname;
    private String fromloc;
    private String toloc;
    private LocalDateTime departtime;
    private LocalDateTime arrtime;
    private int totalseat;
    private float price;
    private int avaliseat;
    @OneToMany(mappedBy = "bfid",cascade = CascadeType.ALL)
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
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
	public LocalDateTime getDeparttime() {
		return departtime;
	}
	public void setDeparttime(LocalDateTime departtime) {
		this.departtime = departtime;
	}
	public LocalDateTime getArrtime() {
		return arrtime;
	}
	public void setArrtime(LocalDateTime arrtime) {
		this.arrtime = arrtime;
	}
	public int getTotalseat() {
		return totalseat;
	}
	public void setTotalseat(int totalseat) {
		this.totalseat = totalseat;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAvaliseat() {
		return avaliseat;
	}
	public void setAvaliseat(int avaliseat) {
		this.avaliseat = avaliseat;
	}
    

}
