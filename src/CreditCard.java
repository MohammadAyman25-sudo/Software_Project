
public class CreditCard implements Payment , AddFunds {
	
		Wallet w ;
		public void Pay() 
		{
			System.out.println("Paying with CreditCard Process Done Successfully.");
		}

		public void Pay(double F) 
		{
			w.setAmount( w.getAmount() + F);
			System.out.println("Fund Process Done Successfully.");
		}
		
}
