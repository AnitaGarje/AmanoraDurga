package com.AmanoraDurga.Model.Admin;

public class Unit {
	
	private int id;
	private String code;
	private double basicUnitCost;
	private double totalUnitCost;
	private double totalUnitCharges;
	private double totalUnitTaxesCharge;
	private double carpetarea;
	private double saleablearea;
	private Floor floor;
	private Project project;
	private Sector sector;
	private Tower tower;
	private FlatType flatype;
	public Unit(){ }
	
	public Unit(int id, String code, double basicUnitCost,
			double totalUnitCost, double totalUnitCharges,
			double totalUnitTaxesCharge, double carpetarea,
			double saleablearea, Floor floor, Project project, Sector sector,
			Tower tower) {
		//super();
		this.id = id;
		this.code = code;
		this.basicUnitCost = basicUnitCost;
		this.totalUnitCost = totalUnitCost;
		this.totalUnitCharges = totalUnitCharges;
		this.totalUnitTaxesCharge = totalUnitTaxesCharge;
		this.carpetarea = carpetarea;
		this.saleablearea = saleablearea;
		this.floor = floor;
		this.project = project;
		this.sector = sector;
		this.tower = tower;
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
	public double getCarpetarea() {
		return carpetarea;
	}
	public void setCarpetarea(double carpetarea) {
		this.carpetarea = carpetarea;
	}
	public double getSaleablearea() {
		return saleablearea;
	}
	public void setSaleablearea(double saleablearea) {
		this.saleablearea = saleablearea;
	}
	public Floor getFloor() {
		return floor;
	}
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
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
	public FlatType getFlatype() {
		return flatype;
	}
	public void setFlatype(FlatType flatype) {
		this.flatype = flatype;
	}
	
}
