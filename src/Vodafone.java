
public class Vodafone implements ServiceProvider{
	public void CreateRecharge() {
		VodafoneRecharge Vo = new VodafoneRecharge() ;
		Vo.serve();
	}

	public void CreateInternet() {
		VodafoneInternet Vo = new VodafoneInternet() ;
		Vo.serve();
	}
}
