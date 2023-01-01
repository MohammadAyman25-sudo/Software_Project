package com.example.MyFawry.Payment;

import com.example.MyFawry.models.Wallet;

public class WalletPay implements Payment {
	public void Pay() {
		Wallet w = new Wallet();
		System.out.println("Paying With Payment.Wallet Process Done Successfully.");
	}
}
