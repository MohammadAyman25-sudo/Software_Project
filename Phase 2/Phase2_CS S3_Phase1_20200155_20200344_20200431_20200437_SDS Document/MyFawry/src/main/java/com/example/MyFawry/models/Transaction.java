package com.example.MyFawry.models;

public class Transaction {
	private Wallet wallet ;
	private boolean RefundStatus , AcceptRefund ;
	private String ProviderName , ServiceName ;
	public boolean isAcceptRefund() {
		return AcceptRefund;
	}
	private double TotalMoneyPaid ;
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
	
	public void setRefundStatus(boolean refundstatus) {
		this.RefundStatus = refundstatus;
	}
	
	public void ReturnMoney( double D )
	{
		wallet.setAmount(wallet.getAmount()+D);
	}
}
