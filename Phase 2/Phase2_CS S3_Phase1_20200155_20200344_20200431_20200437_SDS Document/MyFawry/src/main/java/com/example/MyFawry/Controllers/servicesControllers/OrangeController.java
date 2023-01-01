package com.example.MyFawry.Controllers.servicesControllers;

import com.example.MyFawry.bsl.Service.Orange;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrangeController {
	private Orange or = new Orange();
	
	@PostMapping("/Orange/Recharge")
	public void createRecharge(@RequestBody String phone, @RequestBody int amount) {
		this.or.CreateRecharge(phone, amount);
	}

	@PostMapping("/Orange/Internet")
	public void createInternet(@RequestBody String phone, @RequestBody int amount) {
		this.or.CreateInternet(phone, amount);
	}
}
