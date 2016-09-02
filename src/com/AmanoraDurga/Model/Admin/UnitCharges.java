package com.AmanoraDurga.Model.Admin;

public class UnitCharges {
	private int id;
	private String code;
	private String description;
	private double chargesPerSqm;
	public UnitCharges(){}
	public UnitCharges(int id, String code, String description,
			double chargesPerSqm) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.chargesPerSqm = chargesPerSqm;
	}
	public double getChargesPerSqm() {
		return chargesPerSqm;
	}
	public void setChargesPerSqm(double chargesPerSqm) {
		this.chargesPerSqm = chargesPerSqm;
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
