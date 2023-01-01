package com.example.MyFawry.bsl;

import com.example.MyFawry.Observer.Observer;
import com.example.MyFawry.bsl.AdminBSL;
import java.util.Scanner;
import java.util.ArrayList;
import com.example.MyFawry.models.Transaction;

public class UserBSL implements Observer{
	
	private AdminBSL A = new AdminBSL() ;
	public ArrayList<Transaction> ArrayOfTransactions = new ArrayList<Transaction>();
	
	public void AddFunds(double fund) {
		
	}
	
	public String Search(String ServiceName )
	{
		System.out.println("Search For Any Service You Want: ");
		Scanner myObj = new Scanner(System.in);
		return myObj.nextLine();

	}
	public boolean signin(String email, String password) {
		return true;
	}
	public boolean signup(String email, String password) {
		return true;
	}
	public String[] search(String service) {
		String []s = {"Mobile", "Internet"};
		return s;
	}
	public void Update()
	{
		if( A.AcceptRefund() )
		{
			for(Transaction t:ArrayOfTransactions)
			{
				if( t.isRefundStatus())
				{
					t.ReturnMoney(t.getTotalMoneyPaid());
					t.setRefundStatus(false);
				}
			}
		}
	}
	
	public boolean Pay(String service, String paymethod) {
		return true;
	}
	
	public boolean requestRefund() {
		return true;
	}
	public void CheckDiscount()
	{
		A.AddDiscount(this) ;
	}
}
