package com.exilant.training.day004.stratagy;

public class PaymentType {
	
	private CreditCard creditCard;
	private EWallet eWallet;
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	public EWallet geteWallet() {
		return eWallet;
	}
	public void seteWallet(EWallet eWallet) {
		this.eWallet = eWallet;
	}
	public PaymentType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PaymentType(CreditCard creditCard, EWallet eWallet) {
		super();
		this.creditCard = creditCard;
		this.eWallet = eWallet;
	}

	
	public Payment getPayment(PaymentType paymentType) {
		
		if(paymentType.equals(this.creditCard)) {
			return new CreditCard();
		}else {
			return new EWallet();
		}
		
	}
	

}
