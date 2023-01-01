package com.example.MyFawry.Controllers;
import com.example.MyFawry.bsl.Authentication;
import com.example.MyFawry.models.Usermodel;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {
	private Authentication authen = new Authentication();
	
	public AuthenticationController(Authentication a) {
		this.authen = a;
	}
	
	public boolean signup(Usermodel u) {
		return this.authen.SignUp(u);
	}
	
	public boolean signin(Usermodel u) {
		return this.authen.SignIn(u);
	}
}
