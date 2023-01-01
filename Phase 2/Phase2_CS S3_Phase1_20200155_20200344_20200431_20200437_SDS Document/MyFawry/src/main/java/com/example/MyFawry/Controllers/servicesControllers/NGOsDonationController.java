package com.example.MyFawry.Controllers.servicesControllers;

import com.example.MyFawry.bsl.Service.NGOs;
import org.springframework.web.bind.annotation.*;

@RestController
public class NGOsDonationController {
	private NGOs ng = new NGOs();
	
	@PostMapping("/NGOs/Donate")
	public void Serve() {
		this.ng.serve();
	}
}
