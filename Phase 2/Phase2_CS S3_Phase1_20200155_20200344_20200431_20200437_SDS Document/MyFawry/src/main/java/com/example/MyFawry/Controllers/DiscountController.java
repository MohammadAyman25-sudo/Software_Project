package com.example.MyFawry.Controllers;

import com.example.MyFawry.bsl.*;
import com.example.MyFawry.models.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class DiscountController {
	private Discounts discount;
	
	public DiscountController(Discounts discount) {
		this.discount = discount;
	}
	
	public void addDiscount(Discount d) {
		discount.addDiscount(d);
	}
	
	public void removeDiscount(Discount d) {
		discount.removeDiscount(d);
	}
}
