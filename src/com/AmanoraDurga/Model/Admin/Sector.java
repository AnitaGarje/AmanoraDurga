package com.AmanoraDurga.Model.Admin;

import java.util.HashSet;
import java.util.Set;

public class Sector {
	private int id;
	private String code;
	private String description;
	private Project project; 
	private Set<Tower> towers = new HashSet<Tower>(0);
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
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Set<Tower> getTowers() {
		return towers;
	}
	public void setTowers(Set<Tower> towers) {
		this.towers = towers;
	}

	


}
