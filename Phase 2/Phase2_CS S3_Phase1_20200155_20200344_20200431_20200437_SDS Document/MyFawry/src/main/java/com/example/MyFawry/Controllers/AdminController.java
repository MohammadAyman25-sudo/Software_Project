package com.example.MyFawry.Controllers;

import com.example.MyFawry.bsl.AdminBSL;
import com.example.MyFawry.Observer.Observer;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
	private AdminBSL admin;
	
	public AdminController(AdminBSL admin) {
		this.admin = admin;
	}
	
	public double addDiscount(Observer o) {
		return this.admin.AddDiscount(o);
	}
	
	public boolean acceptRefund()
	{
		return this.admin.AcceptRefund();
	}
	public boolean rejectRefund()
	{
		return this.admin.RejectRefund();
	}
	public void registerObserver(Observer O)
	{
		this.admin.RegisterObserver(O);
	}
	public void notifyObserver()
	{
		this.admin.Notify();
	}
}
