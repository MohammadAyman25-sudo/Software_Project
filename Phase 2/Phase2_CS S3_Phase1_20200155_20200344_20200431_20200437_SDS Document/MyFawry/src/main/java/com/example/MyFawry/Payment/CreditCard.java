package com.example.MyFawry.Payment;

import com.example.MyFawry.models.Wallet;

public class CreditCard implements Payment{
	Wallet w ;
	public void Pay() 
	{
		System.out.println("Paying with Payment.CreditCard Process Done Successfully.");
	}

	
}
