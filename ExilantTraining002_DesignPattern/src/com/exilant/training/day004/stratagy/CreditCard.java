package com.exilant.training.day004.stratagy;

public class CreditCard implements Payment {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpire;
	private double discount;
	private String bankName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getDateOfExpire() {
		return dateOfExpire;
	}

	public void setDateOfExpire(String dateOfExpire) {
		this.dateOfExpire = dateOfExpire;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", dateOfExpire="
				+ dateOfExpire + ", discount=" + discount + ", bankName=" + bankName + "]";
	}

	public CreditCard(String name, String cardNumber, String cvv, String dateOfExpire, double discount,
			String bankName) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpire = dateOfExpire;
		this.discount = discount;
		this.bankName = bankName;
	}

	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay(int amount) {
		
		if(this.bankName.equalsIgnoreCase("hdfc")) {
			amount=(int)(amount-(amount*0.1));
			System.out.println("Paid amount here for hdvc  "+amount);
		}else {
			System.out.println("Paid amount here "+amount);
		}

	}

}
