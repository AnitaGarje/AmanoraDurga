package com.AmanoraDurga.Model.Admin;

public class UnitArea {
	private int id;
	private double area;
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
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public AreaType getAreatype() {
		return areatype;
	}
	public void setAreatype(AreaType areatype) {
		this.areatype = areatype;
	}
	private Unit unit;
	private AreaType areatype;

}
