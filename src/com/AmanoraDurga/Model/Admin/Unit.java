package com.AmanoraDurga.Model.Admin;

public class Unit {
	
	private int id;
	private String code;
	private double basicUnitCost;
	private double totalUnitCost;
	private double totalUnitCharges;
	private double totalUnitTaxesCharge;
	private Floor floor;
	private Project project;
	private Sector sector;
	private Tower tower;
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Sector getSector() {
		return sector;
	}
	public void setSector(Sector sector) {
		this.sector = sector;
	}
	public Tower getTower() {
		return tower;
	}
	public void setTower(Tower tower) {
		this.tower = tower;
	}

	//private FlatType flatype;
	

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
	public double getBasicUnitCost() {
		return basicUnitCost;
	}
	public void setBasicUnitCost(double basicUnitCost) {
		this.basicUnitCost = basicUnitCost;
	}
	public double getTotalUnitCost() {
		return totalUnitCost;
	}
	public void setTotalUnitCost(double totalUnitCost) {
		this.totalUnitCost = totalUnitCost;
	}
	public double getTotalUnitCharges() {
		return totalUnitCharges;
	}
	public void setTotalUnitCharges(double totalUnitCharges) {
		this.totalUnitCharges = totalUnitCharges;
	}
	public double getTotalUnitTaxesCharge() {
		return totalUnitTaxesCharge;
	}
	public void setTotalUnitTaxesCharge(double totalUnitTaxesCharge) {
		this.totalUnitTaxesCharge = totalUnitTaxesCharge;
	}
	public Floor getFloor() {
		return floor;
	}
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	

}
