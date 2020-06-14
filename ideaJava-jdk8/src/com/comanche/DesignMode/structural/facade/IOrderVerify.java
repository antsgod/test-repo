package com.comanche.DesignMode.structural.facade;

// 订单校验接口
public interface IOrderVerify {
	public boolean verifyShippingAddress(int pincode);
}
