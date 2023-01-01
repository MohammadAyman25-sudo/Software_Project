package com.example.MyFawry.models;
import java.util.List;
import com.example.MyFawry.models.Discount;

public class Servicemodel {
	private String name;
	private List<Discount> disc;
	public void setName(String name) {
        this.name = name;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.disc = discounts;
    }

    public String getName() {
        return name;
    }

    public List<Discount> getDiscounts() {
        return disc;
    }
}
