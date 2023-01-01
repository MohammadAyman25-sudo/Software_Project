package com.example.MyFawry.bsl.Service;

import java.util.*;

public abstract class ServiceProvider {
	private final List<ServiceBSL> services = new ArrayList<>();
	public abstract String CreateRecharge(String phonenumber, int amount);
	public abstract String CreateInternet(String number, int amount);
}
