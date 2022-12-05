
public class OrangeInternet extends InternetPaymentService {

	@Override
	public void serve() {
		System.out.println("U Have Charged " + ChargeAmount + "Successfull in Number" + MobileNumber ) ;
	}
	
}
