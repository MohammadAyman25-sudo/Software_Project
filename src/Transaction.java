
public class Transaction {
	Wallet wallet ;
	boolean RefundStatus , AcceptRefund ;
	String ProviderName , ServiceName ;
	public boolean isAcceptRefund() {
		return AcceptRefund;
	}
	double TotalMoneyPaid ;
	public boolean isRefundStatus() {
		return RefundStatus;
	}
	public void setProviderName(String providerName) {
		ProviderName = providerName;
	}
	public String getProviderName() {
		return ProviderName;
	}
	public void setServiceName(String serviceName) {
		ServiceName = serviceName;
	}
	public String getServiceName() {
		return ServiceName;
	}
	public void setTotalMoneyPaid(double totalMoneyPaid) {
		TotalMoneyPaid = totalMoneyPaid;
	}
	public double getTotalMoneyPaid() {
		return TotalMoneyPaid;
	}
	public void ReturnMoney( double D )
	{
		wallet.setAmount(wallet.getAmount()+D);
	}
}
