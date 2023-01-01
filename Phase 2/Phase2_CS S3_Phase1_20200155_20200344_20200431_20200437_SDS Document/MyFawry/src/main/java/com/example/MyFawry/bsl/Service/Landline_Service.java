package com.example.MyFawry.bsl.Service;

public abstract class Landline_Service extends ServiceProvider{
	int MobileNumber ;
	double ChargeAmount ;
    public abstract void serve();
    public String CreateRecharge(String s, int p) {
    	return null;
	}

	public String CreateInternet(String s, int p) {
		return null;
	}
}
