import java.util.Scanner;
import java.util.ArrayList;
public class User implements Observer{
	Admin A = new Admin() ;
	Services service ;
	String UserName , Password , Email ;
	public ArrayList<Transaction> ArrayOfTransactions = new ArrayList<Transaction>();
	Payment Method0 ;
	AddFunds Method1 ;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPassword() {
		return Password;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getEmail() {
		return Email;
	}
	public void AddFundsToWallet( double F )
	{
		Method1 = new CreditCard() ;
		Method1.Pay(F);
	}
	public String Search(String ServiceName )
	{
		System.out.println("Search For Any Service You Want: ");
		Scanner myObj = new Scanner(System.in);
		return myObj.nextLine();

	}
	public void Update()
	{
		if( A.AcceptRefund() == true )
		{
			for(int i=0;i<this.ArrayOfTransactions.size();i++)
			{
				if( this.ArrayOfTransactions.get(i).isRefundStatus() == true )
				{
					this.ArrayOfTransactions.get(i).ReturnMoney( ArrayOfTransactions.get(i).getTotalMoneyPaid());
					this.ArrayOfTransactions.get(i).RefundStatus = false ; 
				}
			}
		}
	}
	public void CheckDiscount()
	{
		A.AddDiscount() ;
	}
	
}
