package com.AmanoraDurga.Model.Admin;

public class FlatType implements java.io.Serializable {

	private int id;
	private String code;
	private String type;
	
	public FlatType()
	{
		
	}
	public FlatType(int id, String code, String type) {
		//super();
		this.id = id;
		this.code = code;
		this.type = type;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
