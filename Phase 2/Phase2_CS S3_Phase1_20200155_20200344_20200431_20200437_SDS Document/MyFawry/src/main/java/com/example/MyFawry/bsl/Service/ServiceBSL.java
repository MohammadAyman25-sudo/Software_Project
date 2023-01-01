package com.example.MyFawry.bsl.Service;

import java.util.List;
import java.util.ArrayList;
import com.example.MyFawry.Services.*;

public class ServiceBSL {
	private List<ServiceProvider> list;
	
	public ServiceBSL() {
		this.list = new ArrayList<>();
	}
	
	public void AddToList(String name){
        if(name.equals("E"))
        {
        	ServiceProvider provider=new Etisalat();
          list.add(provider);
        }
        if(name.equals("W")){
        	ServiceProvider provider=new We();
            list.add(provider);
        }
        if(name.equals("O")){
        	ServiceProvider provider=new Orange();
            list.add(provider);
        }


    }
}
