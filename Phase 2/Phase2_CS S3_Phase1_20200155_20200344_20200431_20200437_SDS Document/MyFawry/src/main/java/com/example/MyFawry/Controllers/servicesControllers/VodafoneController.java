package com.example.MyFawry.Controllers.servicesControllers;

import com.example.MyFawry.bsl.Service.Vodafone;
import org.springframework.web.bind.annotation.*;

@RestController
public class VodafoneController {
	private Vodafone vo = new Vodafone();
	
	@PostMapping("/Vodafone/Recharge")
	public void createRecharge(@RequestBody String phone, @RequestBody int amount) {
		this.vo.CreateRecharge(phone, amount);
	}

	@PostMapping("/Vodafone/Internet")
	public void createInternet(@RequestBody String phone, @RequestBody int amount) {
		this.vo.CreateInternet(phone, amount);
	}
}
