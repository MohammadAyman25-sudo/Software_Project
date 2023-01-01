package com.example.MyFawry.bsl.Service;

public class Orange extends ServiceProvider{
	public String CreateRecharge(String phoneNumber, int amount) {
		
		if(phoneNumber.length() != 11) {
			return "Invalid phone number";
		}
		
		return "Orange Recharge is Done Succefully";
	}

	public String CreateInternet(String number, int amount) {
		return "Orange Internet is Renewed Succefully";
	}
}
