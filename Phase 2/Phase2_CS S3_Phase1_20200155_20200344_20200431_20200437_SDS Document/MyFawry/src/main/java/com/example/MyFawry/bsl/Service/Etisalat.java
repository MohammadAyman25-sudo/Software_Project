package com.example.MyFawry.bsl.Service;

public class Etisalat extends ServiceProvider {
	public String CreateRecharge(String phoneNumber, int amount) {
		
		if(phoneNumber.length() != 11) {
			return "Invalid phone number";
		}
		
		return "Etisalat Recharge is Done Succefully";
	}

	public String CreateInternet(String number, int amount) {
		return "Etisalat Internet is Renewed Succefully";
	}
}
