package com.example.MyFawry.bsl.Service;

public abstract class Donation extends ServiceProvider {
	int Code ;
	double ChargeAmount ;
    public abstract void serve();
    public String CreateRecharge(String p, int c) {
    	return null;
	}

	public String CreateInternet(String p, int c) {
		return null;
	}
}
