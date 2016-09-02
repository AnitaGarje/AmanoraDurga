package com.AmanoraDurga.Model.Admin;

public class UnitTypeArea implements java.io.Serializable{
	private int id;
	private double area;
	private AreaType areatype;
	private FlatType flatType;
	public UnitTypeArea(){}
	
	public UnitTypeArea(int id, double area, AreaType areatype, FlatType flatType) {
		//super();
		this.id = id;
		this.area = area;
		this.areatype = areatype;
		this.flatType = flatType;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public AreaType getAreatype() {
		return areatype;
	}
	public void setAreatype(AreaType areatype) {
		this.areatype = areatype;
	}
	public FlatType getflatType() {
		return flatType;
	}
	public void setFlatType(FlatType flatType) {
		this.flatType = flatType;
	}


}
