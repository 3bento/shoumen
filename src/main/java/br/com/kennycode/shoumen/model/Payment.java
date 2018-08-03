package br.com.kennycode.shoumen.model;

public class Payment {

	private Long id;
	private String description;
	private double value;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(Long id, String description, double value) {
		super();
		this.id = id;
		this.description = description;
		this.value = value;
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

}
