package com.example.MyFawry.bsl.Service;

public class MonthlyReceipt extends Landline_Service{
	@Override
    public void serve() {
		System.out.println("U Have Charged " + ChargeAmount + "Successfull in Number" + MobileNumber + 
			"Monthly." ) ;
    }
}
