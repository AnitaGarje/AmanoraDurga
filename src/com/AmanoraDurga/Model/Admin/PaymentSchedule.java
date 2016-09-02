package com.AmanoraDurga.Model.Admin;

public class PaymentSchedule  implements java.io.Serializable{

	private int id;
	private double paymentpercent;
	private double payment;
	private TowerStage towerstage;
	private Unit unit;
	
	public PaymentSchedule(int id, double paymentpercent, double payment,
			TowerStage towerstage, Unit unit) {
		super();
		this.id = id;
		this.paymentpercent = paymentpercent;
		this.payment = payment;
		this.towerstage = towerstage;
		this.unit = unit;
	}
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
	public TowerStage gettowerstage() {
		return towerstage;
	}
	public void settowerstage(TowerStage towerstage) {
		this.towerstage = towerstage;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	

}
