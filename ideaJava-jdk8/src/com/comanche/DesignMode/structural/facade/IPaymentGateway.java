package com.comanche.DesignMode.structural.facade;

// 支付接口
public interface IPaymentGateway {
	public boolean verifyCardDetails(String cardNo);
	public boolean processPayment(String cardNo, float cost);
}
