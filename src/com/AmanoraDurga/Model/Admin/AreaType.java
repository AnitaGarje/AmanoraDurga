package com.AmanoraDurga.Model.Admin;

public class AreaType implements java.io.Serializable {
	private int id;
	private String code;
	private String description;
	public AreaType(){}
	
	public AreaType(int id, String code, String description) {
		//super();
		this.id = id;
		this.code = code;
		this.description = description;
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


}
