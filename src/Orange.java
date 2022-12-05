
public class Orange implements ServiceProvider{
	public void CreateRecharge() {
		OrangeRecharge Or = new OrangeRecharge() ;
		Or.serve();
	}

	public void CreateInternet() {
		OrangeInternet Or = new OrangeInternet() ;
		Or.serve();
	}
}
