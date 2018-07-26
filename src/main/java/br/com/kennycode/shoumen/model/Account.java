package br.com.kennycode.shoumen.model;

import java.util.Calendar;

public class Account {

	private Long id;
	private String description;
	private  boolean isPaid;
	private double value;
	private Calendar datePayment;
	private TypeOfAccount type;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Calendar getDatePayment() {
		return datePayment;
	}
	public void setDatePayment(Calendar datePayment) {
		this.datePayment = datePayment;
	}
	public TypeOfAccount getType() {
		return type;
	}
	public void setType(TypeOfAccount type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", description=" + description + ", isPaid=" + isPaid + ", value=" + value
				+ ", datePayment=" + datePayment.getTime() + ", type=" + type + "]";
	}
	
	
}