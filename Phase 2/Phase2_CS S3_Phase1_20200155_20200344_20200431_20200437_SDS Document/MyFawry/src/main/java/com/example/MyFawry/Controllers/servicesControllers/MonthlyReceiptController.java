package com.example.MyFawry.Controllers.servicesControllers;

import com.example.MyFawry.bsl.Service.MonthlyReceipt;
import org.springframework.web.bind.annotation.*;

@RestController
public class MonthlyReceiptController {
	private MonthlyReceipt mr = new MonthlyReceipt();
	
	@PostMapping("/landline/MonthlyReceipt")
	public void Serve() {
		this.mr.serve();
	}
}
