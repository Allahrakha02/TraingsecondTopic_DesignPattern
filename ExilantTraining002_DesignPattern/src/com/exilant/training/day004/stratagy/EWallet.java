package com.exilant.training.day004.stratagy;

public class EWallet implements Payment {
	private String email;
	private String password;
	private String walletName;

	@Override
	public String toString() {
		return "EWallet [email=" + email + ", password=" + password + ", walletName=" + walletName + "]";
	}

	public EWallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EWallet(String email, String password, String walletName) {
		super();
		this.email = email;
		this.password = password;
		this.walletName = walletName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	@Override
	public void pay(int amount) {

		if(this.walletName.equalsIgnoreCase("hdfc")) {
			amount=(int)(amount-(amount*0.1));
			System.out.println("Paid amount here for Paytm  "+amount);
		}else {
			System.out.println("Paid amount here (Paytm) "+amount);
		}

	}

}
