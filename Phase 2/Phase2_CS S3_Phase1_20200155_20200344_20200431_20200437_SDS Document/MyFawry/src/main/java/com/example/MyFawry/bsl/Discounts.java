package com.example.MyFawry.bsl;

import java.util.List;
import java.util.ArrayList;
import com.example.MyFawry.models.Discount;

public class Discounts {
	private List<Discount> discountList;
	
	public Discounts() {
		this.discountList = new ArrayList<>();
	}
	
	public void addDiscount(Discount discount){
        discountList.add(discount);
    }

    public void removeDiscount(Discount discount){
        discountList.remove(discount);
    }
}
