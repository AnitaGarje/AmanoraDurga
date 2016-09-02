package com.AmanoraDurga.Model.Admin;

import java.util.HashSet;
import java.util.Set;

public class Floor implements java.io.Serializable {
	
	private int id;
	private String code;
	private String description; 
	private Set<Unit> units=new HashSet<Unit>(0);
	
	private Floor() { }
	
	public Floor(int id, String code, String description, Tower tower){
			//Set<Unit> units) {
		//super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.setUnits(units);
	}
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
	public Set<Unit> getUnits() {
		return units;
	}

	public void setUnits(Set<Unit> units) {
		this.units = units;
	}

}
