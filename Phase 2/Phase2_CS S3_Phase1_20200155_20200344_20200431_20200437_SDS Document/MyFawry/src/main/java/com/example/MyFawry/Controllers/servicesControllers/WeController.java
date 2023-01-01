package com.example.MyFawry.Controllers.servicesControllers;

import org.springframework.web.bind.annotation.*;

import com.example.MyFawry.bsl.Service.We;

@RestController
public class WeController {
	private We we = new We();
	
	@PostMapping("/We/Recharge")
	public void createRecharge(@RequestBody String phone, @RequestBody int amount) {
		this.we.CreateRecharge(phone, amount);
	}

	@PostMapping("/We/Internet")
	public void createInternet(@RequestBody String phone, @RequestBody int amount) {
		this.we.CreateInternet(phone, amount);
	}
}
