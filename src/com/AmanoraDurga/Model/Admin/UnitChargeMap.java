package com.AmanoraDurga.Model.Admin;

public class UnitChargeMap {

	private int id;
	private Unit unit;
	private UnitCharges unitcharges;
    private double	calculatedcharges;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public UnitCharges getUnitcharges() {
		return unitcharges;
	}
	public void setUnitcharges(UnitCharges unitcharges) {
		this.unitcharges = unitcharges;
	}
	public double getCalculatedcharges() {
		return calculatedcharges;
	}
	public void setCalculatedcharges(double calculatedcharges) {
		this.calculatedcharges = calculatedcharges;
	}
	
}
