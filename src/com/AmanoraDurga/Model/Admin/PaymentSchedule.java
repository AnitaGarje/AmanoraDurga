package com.AmanoraDurga.Model.Admin;

public class PaymentSchedule {

	private int id;
	private double paymentpercent;
	private double payment;
	private TowerStageCompletion towerstgcomp;
	private Unit unit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPaymentpercent() {
		return paymentpercent;
	}
	public void setPaymentpercent(double paymentpercent) {
		this.paymentpercent = paymentpercent;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public TowerStageCompletion getTowerstgcomp() {
		return towerstgcomp;
	}
	public void setTowerstgcomp(TowerStageCompletion towerstgcomp) {
		this.towerstgcomp = towerstgcomp;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	

}
