package com.AmanoraDurga.Model.Admin;

public class Floor {
	
	private int id;
	private String code;
	private String description;
	private Tower tower; 
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
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

	public Tower getTower() {
		return tower;
	}
	public void setTower(Tower tower) {
		this.tower = tower;
	}

}
