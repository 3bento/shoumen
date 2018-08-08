package br.com.kennycode.shoumen.model;

import java.util.Calendar;
import java.util.UUID;

public class Payment {

	private UUID uuid;
	private Long id;
	private String description;
	private double value;
	private Calendar created;
	private Calendar updated;
	private boolean pay;
	private Calendar paymentDate;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public Long getId() {
		return id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
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

	public Calendar getCreated() {
		return created;
	}

	public void setCreated(Calendar created) {
		this.created = created;
	}

	public Calendar getUpdated() {
		return updated;
	}

	public void setUpdated(Calendar updated) {
		this.updated = updated;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

	public boolean isPay() {
		return pay;
	}

	public Calendar getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Calendar paymentDate) {
		this.paymentDate = paymentDate;
	}
}