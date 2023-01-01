package com.example.MyFawry.Controllers.servicesControllers;

import com.example.MyFawry.bsl.Service.QuarterReceipt;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuarterReceiptController {
	private QuarterReceipt qr = new QuarterReceipt();
	
	@PostMapping("/landline/QuarterReceipt")
	public void Serve() {
		this.qr.serve();
	}
}
