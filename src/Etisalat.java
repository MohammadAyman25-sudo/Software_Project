
public class Etisalat implements ServiceProvider{
	public void CreateRecharge() {
		EtisalatRecharge Et = new EtisalatRecharge() ;
		Et.serve();
	}

	public void CreateInternet() {
		EtisalatInternet Et = new EtisalatInternet() ;
		Et.serve();
	}
}
