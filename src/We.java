
public class We implements ServiceProvider{
	public void CreateRecharge() {
		WeRecharge we = new WeRecharge() ;
		we.serve();
	}

	public void CreateInternet() {
		WeInternet we = new WeInternet() ;
		we.serve() ;
	}

}
