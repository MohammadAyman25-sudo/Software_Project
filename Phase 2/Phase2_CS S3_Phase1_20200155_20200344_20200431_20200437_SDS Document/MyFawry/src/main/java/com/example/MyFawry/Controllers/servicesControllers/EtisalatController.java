package com.example.MyFawry.Controllers.servicesControllers;

import org.springframework.web.bind.annotation.*;
import com.example.MyFawry.bsl.Service.Etisalat;

@RestController
public class EtisalatController {
	private Etisalat et = new Etisalat();
	
	@PostMapping("/Etisalat/Recharge")
	public void createRecharge(@RequestBody String phone, @RequestBody int amount) {
		this.et.CreateRecharge(phone, amount);
	}

	@PostMapping("/Etisalat/Internet")
	public void createInternet(@RequestBody String phone, @RequestBody int amount) {
		this.et.CreateInternet(phone, amount);
	}
}
