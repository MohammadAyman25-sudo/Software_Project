
public class VodafoneRecharge extends MobileRechargeService {
	@Override
	public void serve()
	{
		System.out.println("U Have Charged " + ChargeAmount + "Successfull in Number" + MobileNumber ) ;
	}
}
