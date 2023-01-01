package com.example.MyFawry.Controllers.servicesControllers;

import com.example.MyFawry.bsl.Service.Schools;
import org.springframework.web.bind.annotation.*;

@RestController
public class SchoolsDonatonController {
	private Schools school = new Schools();
	
	@PostMapping("/Schools/Donate")
	public void Serve() {
		 this.school.serve();
	}
}
