package com.example.MyFawry.bsl;

import java.util.List;
import java.util.ArrayList;
import com.example.MyFawry.Observer.*;
import com.example.MyFawry.bsl.Service.ServiceBSL;

public class AdminBSL implements Subject {
	private List<Observer> users;
	
	private ServiceBSL services=new ServiceBSL();

    public void AddNewService(String name){
        services.AddToList(name);
    }
    
	public AdminBSL() {
		this.users = new ArrayList<>();
	}
	
	public double AddDiscount(Observer o)
	{
		UserBSL O1 = (UserBSL)o;
		for(Observer ob:users){
			if(o != ob){
				O1 = null;
			}
			else
				O1 = (UserBSL)ob;
		}
		if(O1 != null){
			if( O1.ArrayOfTransactions.size() == 0 )
			{
				System.out.println( "there is a Discount.") ;
				return 0.1 ;
			}
			for(int i=0;i<O1.ArrayOfTransactions.size();i++)
			{
				if( O1.ArrayOfTransactions.get(i).getServiceName().equals("Mobile Recharge Service.Services" ))
				{
					System.out.println( "there is a Discount on Transaction Number" + i) ;
				}
			}
			return 0.2 ;
		}
		return 0.0;
	}
	public boolean AcceptRefund()
	{
		System.out.println("Accepting Refund.") ;
		return true ;
	}
	public boolean RejectRefund()
	{
		System.out.println("Rejecting Refund.") ;
		return true ;
	}
	public void RegisterObserver(Observer O)
	{
		users.add(O);
	}
	public void Notify()
	{
		for(Observer o : users)
		{
			o.Update();
		}
	}
}
