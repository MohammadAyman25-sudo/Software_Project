
public class Admin implements Subject{
	User O1 = new User() ;
	String Name , Email , Password ;
	public void setName(String name) {
		Name = name;
	}
	public String getName() {
		return Name;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getEmail() {
		return Email;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getPassword() {
		return Password;
	}
	public double AddDiscount()
	{
		if( O1.ArrayOfTransactions.size() == 0 )
		{
			System.out.println( "there is a Discount.") ;
			return 0.1 ;
		}
		for(int i=0;i<O1.ArrayOfTransactions.size();i++)
		{
			if( O1.ArrayOfTransactions.get(i).getServiceName() == "Mobile Recharge Services" )
			{
				System.out.println( "there is a Discount on Transaction Number" + i) ;
			}
		}
		return 0.2 ;
		
	}
	public boolean AcceptRefund()
	{
		System.out.println("Accepting Refund.") ;
		return true ;
	}
	public boolean RejectRefund()
	{
		System.out.println("Rejecting Refund.") ;
		return true ;
	}
	public void RegisterOpserver(User O)
	{
		O1 = O ;
	}
	public void Notify()
	{
		for(int i=0;i<O1.ArrayOfTransactions.size();i++)
		{
			O1.Update();
		}
	}
	
}
