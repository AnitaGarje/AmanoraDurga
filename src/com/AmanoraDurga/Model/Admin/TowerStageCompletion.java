package com.AmanoraDurga.Model.Admin;

import java.util.Date;

public class TowerStageCompletion {

	private int id;
	private String code;
	private String description;
	private char status;
	private Date startDate;
	private Date completiondate;
	private Tower tower;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getCompletiondate() {
		return completiondate;
	}
	public void setCompletiondate(Date completiondate) {
		this.completiondate = completiondate;
	}
	public Tower getTower() {
		return tower;
	}
	public void setTower(Tower tower) {
		this.tower = tower;
	}
	

}
