package com.example.MyFawry.Controllers;
import com.example.MyFawry.bsl.UserBSL;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController{
	private UserBSL user = new UserBSL();
	
	public void AddFunds(double amount) {
		this.user.AddFunds(amount);
	}
	
	public boolean SignIn(String email, String password) {
		return this.user.signin(email, password);
	}

	@PostMapping("/SingUp")
	public Response SignUp(String email, String password) {

		System.out.println("User Added!!\n");
		boolean res=new UserBSL().signup(email,password);
		Response response=new Response();
		return response;
	}
	
	public String[] Search(String service) {
		return this.user.search(service);
	}
	
	public boolean RequestRefund() {
		return this.user.requestRefund();
	}
	
	public boolean pay(String service, String pay) {
		return this.user.Pay(service, pay);
	}
}
