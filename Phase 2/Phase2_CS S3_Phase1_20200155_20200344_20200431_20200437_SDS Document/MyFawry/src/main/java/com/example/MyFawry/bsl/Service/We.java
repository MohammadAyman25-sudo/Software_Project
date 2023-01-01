package com.example.MyFawry.bsl.Service;

public class We extends ServiceProvider{
	public String CreateRecharge(String phoneNumber, int amount) {
		
		if(phoneNumber.length() != 11) {
			return "Invalid phone number";
		}
		
		return "We Recharge is Done Succefully";
	}

	public String CreateInternet(String number, int amount) {
		return "We Internet is Renewed Succefully";
	}

}
